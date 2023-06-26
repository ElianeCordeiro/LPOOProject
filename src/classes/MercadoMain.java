package classes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import classes.abstrata.Produto;
import classes.exceptions.PagamentoNaoConfirmadoException;
import classes.exceptions.SalarioNaoValidoException;
import classes.subclasses.Cliente;
import classes.subclasses.Fornecedor;
import classes.subclasses.Funcionario;
import classes.subclasses.Pedido;
import classes.subclasses.ProdutoAlimento;
import classes.subclasses.Setor;


public class MercadoMain {
	
	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		ArrayList<Fornecedor> fornecedores = new ArrayList<>();
		ArrayList<Pedido> pedidos = new ArrayList<>();
		
		ProdutoAlimento produtoAlimento = null;
		Fornecedor fornecedor = null;
		Funcionario funcionario = null;
		Setor setor = null;
		Pedido pedido = null;
		Cliente cliente = null;
		
		
		produtoAlimento = new ProdutoAlimento("31/12/2023", 7.60, "Massa de Trigo", null, "Ambiente", "Estoque");
		fornecedor = new Fornecedor("Casa Flor do Trigo", "Garanhuns", "87990000000", "1112222233400", produtoAlimento);
		produtoAlimento.setFornecedor(fornecedor);
		fornecedores.add(fornecedor);
		
		funcionario = new Funcionario("Mirtes de Jesus", "Garanhuns", "8799900000", "22233344455", "Supervisora", 3200.00, null);
		
		funcionarios.add(funcionario);
		setor = new Setor(1, "Setor de vendas", funcionarios, funcionarios.size(), fornecedores);
		
		Scanner sc = new Scanner(System.in);
		boolean chave_menu = true;
		String nome, cidade, telefone, cpf, cnpj, dataValidade, temperaturaIdeal, localArmazenamento, cargo;
		double preco, salario;
		
		while (chave_menu) {
			int comando = 0;
			boolean lock = true;
			while (lock) {
				try {
					System.out.println("Menus:"
							+ "\n1. Menu setor"
							+ "\n2. Menu funcionario"
							+ "\n3. Menu fornecedor"
							+ "\n4. Menu pedido"
							+ "\n0. Sair");
					comando = sc.nextInt();
					sc.nextLine();
					lock = false;
				} catch (InputMismatchException e) {
					System.out.println("Comando invalido! Tente novamente.");
					sc.nextLine();
				}
			}
			
			
			
			if (comando == 0) {
				System.out.println("Saindo...");
				chave_menu = false;
				
				
				
			}else if (comando == 1) {
				boolean chave_setor = true;
				while(chave_setor) {
					try {
						System.out.println("Menu Setor"
								+ "\n1. Pagar Salário dos Funcionários;"
								+ "\n2. Contratar fornecedor;"
								+ "\n3. Contratar funcionário;"
								+ "\n4. Demitir Funcionário;"
								+ "\n0. Voltar.");
						int comando_setor = sc.nextInt();
						sc.nextLine();
						
						if (comando_setor == 0) {
							chave_setor = false;
						} else if (comando_setor == 1) {
							System.out.println("Informe o CPF do funcionário para pagar seu salário. ");
							cpf = sc.nextLine();
							for (Funcionario f : funcionarios) {
								if(cpf.equals(f.getCpf_CNPJ())) {
									System.out.println("Digite o valor a ser pago. ");
									salario = sc.nextDouble();
									setor.pagarSalarioDoFuncionario(salario);
								}
							}
						} else if(comando_setor == 2) {
							System.out.println("Informe os dados do fornecedor. ");
							System.out.println("Nome: ");
							nome = sc.nextLine();
							System.out.println("Cidade: ");
							cidade = sc.nextLine();
							System.out.println("Telefone: ");
							telefone = sc.nextLine();
							System.out.println("CNPJ: ");
							cnpj = sc.nextLine();
							
							fornecedor = new Fornecedor(nome, cidade, telefone, cnpj, null);
							
							System.out.println("Dados do produto fornecido: ");
							System.out.println("Data de validade: ");
							dataValidade = sc.nextLine();
							System.out.println("Preco: ");
							preco = sc.nextDouble();
							sc.nextLine();
							System.out.println("Nome: ");
							nome = sc.nextLine();
							System.out.println("Temperatura ideal: ");
							temperaturaIdeal = sc.nextLine();
							System.out.println("Local de armazenamento: ");
							localArmazenamento = sc.nextLine();
							
							produtoAlimento = new ProdutoAlimento(dataValidade, preco, nome, fornecedor, temperaturaIdeal, localArmazenamento);
							fornecedor.setTipoProduto(produtoAlimento);
							///fornecedores.add(fornecedor);
							setor.contratarFornecedor(fornecedor);
							
						} else if (comando_setor == 3) {
							System.out.println("Informe os dados do funcionario. ");
							System.out.println("Nome: ");
							nome = sc.nextLine();
							System.out.println("Cidade: ");
							cidade = sc.nextLine();
							System.out.println("Telefone: ");
							telefone = sc.nextLine();
							System.out.println("CPF: ");
							cpf = sc.nextLine();
							System.out.println("Cargo: ");
							cargo = sc.nextLine();
							System.out.println("Salario: ");
							salario = sc.nextDouble();
							
							funcionario = new Funcionario(nome, cidade, telefone, cpf, cargo, salario, setor);
							setor.contratarFuncionario(funcionario);
							///funcionarios.add(funcionario);
						
						} else if (comando_setor == 4) {
							System.out.println("Digite o CPF do funcionario que deseja demitir: ");
							cpf = sc.nextLine();
							Funcionario demitir = null;
							for (Funcionario f : funcionarios) {
								if(f.getCpf_CNPJ().equals(cpf)) {
									demitir = f;
								} 
							}
							funcionarios.remove(demitir);
						} 
						
					} catch (InputMismatchException e) {
						System.out.println("Comando invalido! Tente novamente.");
						sc.nextLine();
					} catch (SalarioNaoValidoException exc) {
						System.out.println("Valor informado não é válido.");
						sc.nextLine();
					}
					
				}
				
			} else if (comando == 2) {
				boolean chave_funcionario = true;
				while (chave_funcionario) {
					try {
						System.out.println("Menu funcionario"
								+ "\n1. Listar todos os funcionarios"
								+ "\n0. Voltar");
						int comando_funcionario = sc.nextInt();
						sc.nextLine();
						
						if (comando_funcionario == 0) {
							chave_funcionario = false;
						} else if (comando_funcionario == 1) {
							System.out.println("Funcionarios:");
							for (Funcionario i : setor.getFuncionarios()) {
								System.out.println(i.toString());
							}
						} else {
							System.out.println("Comando inválido! Tente novamente.");
						}
					} catch (InputMismatchException e) {
						sc.nextLine();
						System.out.println("Comando invalido! Tente novamente.");
					}
				}
				
				
				
			} else if (comando == 3) {
				boolean chave_fornecedor = true;
				while(chave_fornecedor) {
					try {
						System.out.println("Menu fornecedor"
								+ "\n1. Listar fornecedores"
								+ "\n2. Listar produtos fornecidos por cada fornecedor"
								+ "\n0. Voltar");
						int comando_fornecedor = sc.nextInt();
						sc.nextLine();
						
						if (comando_fornecedor == 0) {
							chave_fornecedor = false;
						} else if (comando_fornecedor == 1) {
							System.out.println("Fornecedores");
							for (Fornecedor i : fornecedores) {
								System.out.println(i.toString());
							}
						} else if (comando_fornecedor == 2) {
							for (Fornecedor j : fornecedores) {
								System.out.println("\nFornecedor: "+ j.getNome() + "\nProdutos fornecidos:\n " + j.getTipoProduto().toString());
							}
						}
					} catch (InputMismatchException e) {
						System.out.println("Comando invalido! Tente novamente.");
						sc.nextLine();
					}
				}
				
				
			} else if (comando == 4) {
				boolean chave_pedido = true;
				while (chave_pedido) {
					try {
						System.out.println("Menu Pedido"
								+ "\n1. Realizar pedido"
								+ "\n2. Listar todos os pedidos"
								+ "\n3. Pagar pedido"
								+ "\n0. Voltar");
						int comando_pedido = sc.nextInt();
						sc.nextLine();
						
						if (comando_pedido == 0) {
							chave_pedido = false;
						} else if (comando_pedido == 1) {
							ArrayList<Produto> produtos = new ArrayList<>();
							
							System.out.println("Informe os dados do cliente para realizar o pedido. ");
							System.out.println("Nome: ");
							nome = sc.nextLine();
							System.out.println("Cidade: ");
							cidade = sc.nextLine();
							System.out.println("Telefone: ");
							telefone = sc.nextLine();
							System.out.println("CPF: ");
							cpf = sc.nextLine();
							
							cliente = new Cliente(nome, cidade, telefone, cpf);
							
							System.out.println("Informe os dados do pedido: ");
							System.out.println("Data de realização: ");
							String data = sc.nextLine();
							
							System.out.println("Segue lista dos produtos disponíveis: ");
							for (Fornecedor f : fornecedores ) {
								System.out.println(f.getTipoProduto().toString());
							} 
							System.out.println("Informe quantos produtos deseja comprar. ");
							int quantidade = sc.nextInt();
							sc.nextLine();

							for (int i = 0; i < quantidade; i++) {
								System.out.println("Digite o nome do produto que deseja comprar. ");
								nome = sc.nextLine();
								for (Fornecedor f : fornecedores) {
									if(nome.equalsIgnoreCase(f.getTipoProduto().getNomeProduto())) {
										produtos.add(f.getTipoProduto());
									}
								}
							}
							
							pedido = new Pedido(data, setor, cliente, produtos);
							pedidos.add(pedido);
							
						} else if(comando_pedido == 2) {
							System.out.println("Listando todos os pedidos");
							for (Pedido p : pedidos) {
								System.out.println(p);
							}
						} else if(comando_pedido == 3) {
							System.out.println("Deseja confirmar o pedido de qual cliente? Informe o CPF");
							cpf = sc.nextLine();
							for (Pedido pedido2 : pedidos) {
								if(cpf.equals(pedido2.getCliente().getCpf_CNPJ())) {
									System.out.println("Confirma o pagamento? true/false");
									boolean pagamento = sc.nextBoolean();
									pedido2.confirmarPagamento(pedido.getCliente().realizarPagamentoPedido(pagamento));
								}
							}
						}
						
						
					} catch (InputMismatchException e) {
						sc.nextLine();
						System.out.println("Comando invalido! Tente novamente.");
					}catch (PagamentoNaoConfirmadoException exc) {
						System.out.println("O cliente não confirmou o pagamento.");
						sc.nextLine();
					}
				
				
				}
			} else {
				System.out.println("Comando inválido! Tente novamente.");
			}
		}
		sc.close();
	}

}
