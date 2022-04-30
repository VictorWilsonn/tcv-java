package principal;

import java.util.Scanner;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		GerenciaCliente gClientes = new GerenciaCliente();
		GerenciaProduto gProdutos = new GerenciaProduto();
		int resp = 1;
		while(resp != 0 ){
			System.out.println("Tabajara Comercio e Varejo (TCV)");
			System.out.println("1 - Cliente");
			System.out.println("2 - Produto");
			System.out.println("3 - Compra");
			System.out.println("0 - Sair");
			System.out.print("Digite uma op��o: ");
			
			resp = sc.nextInt();
			
			switch(resp) {
			case 1: 
				gClientes.menu();
				break;
			case 2:
				gProdutos.MenuProduto();
				break;
			case 3:
				break;
			case 4:
				break;
			}
		}
		
	}

}	
;