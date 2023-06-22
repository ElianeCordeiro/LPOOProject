package classes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import classes.subclasses.Fornecedor;
import classes.subclasses.Funcionario;


public class MercadoMain {
	
	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		ArrayList<Fornecedor> fornecedores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean chave_menu = true;
		
		
		
		
		while (chave_menu) {
			int comando = 0;
			boolean lock = true;
			while (lock) {
				try {
					System.out.println("Menus:"
							+ "\n1. Menu funcionario"
							+ "\n2. Menu fornecedor"
							+ "\n3. Menu setor"
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
				
				
				
			} else if (comando == 1) {
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
							for (Funcionario i : funcionarios) {
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
				
				
				
			} else if (comando == 2) {
				boolean chave_fornecedor = true;
				while(chave_fornecedor) {
					try {
						System.out.println("Menu fornecedor"
								+ "\n1. Listar fornecedores"
								+ "\n2. Listar produtos fornecidos"
								+ "\n3. Voltar");
						int comando_fornecedor = sc.nextInt();
						sc.nextLine();
						
						if (comando_fornecedor == 0) {
							chave_fornecedor = false;
						} else if (comando_fornecedor == 1) {
							System.out.println("Fornecedores");
							for (Fornecedor i : fornecedores) {
								System.out.println(i.toString());
							}
						}
					} catch (InputMismatchException e) {
						System.out.println("Comando invalido! Tente novamente.");
						sc.nextLine();
					}
				}
				
				
				
			} else if (comando == 3) {
				
				
				
				
			} else if (comando == 4) {
				
				
				
				
			} else {
				System.out.println("Comando inválido! Tente novamente.");
			}
		}
	}

}
