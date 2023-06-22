package classes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import classes.subclasses.Funcionario;


public class MercadoMain {
	
	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean chave_menu = true;
		boolean lock = true;
		
		
		
		while (chave_menu) {
			int comando = 0;
			while (lock) {
				try {
					System.out.println("Menus:"
							+ "\n1. Menu de funcionarios"
							+ "\n2. Menu de fornecedores"
							+ "\n3. Menu de setores"
							+ "\n4. Menu de pedidos"
							+ "\n0. Sair");
					comando = sc.nextInt();
					sc.nextLine();
					lock = false;
				} catch (InputMismatchException e) {
					System.out.println("Comando inválido! Tente novamente.");
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
						System.out.println("Menu de funcionarios"
								+ "\n1. Listar todos os funcionarios"
								+ "\n0. Voltar");
						int comandofuncionario = sc.nextInt();
						sc.nextLine();
						
						if (comandofuncionario == 0) {
							chave_funcionario = false;
						} else if (comandofuncionario == 1) {
							
						}
					} catch (InputMismatchException e) {
						
					}
				}
				
				
				
			} else if (comando == 2) {
				menuFornecedor();
			} else if (comando == 3) {
				menuSetor();
			} else if (comando == 4) {
				menuPedido();
			} else {
				System.out.println("Comando inválido! Tente novamente.");
			} 
			
		}
	}

}
