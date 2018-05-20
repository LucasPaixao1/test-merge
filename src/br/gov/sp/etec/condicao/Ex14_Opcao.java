package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex14_Opcao {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.println("********************************************************************");
		System.out.println("*                               MENU                               *");
		System.out.println("********************************************************************");
		System.out.println("* 1 – Verificar se um dos números lidos é ou não múltiplo do outro *");
		System.out.println("* 2 – Verificar se os dois números lidos são pares                 *"); 
		System.out.println("* 3 – Verificar se a média dos dois números é maior ou igual a 7   *");
		System.out.println("* 4 – Sair                                                         *");
		System.out.println("********************************************************************");
		
		System.out.println("");

		System.out.print("Informe sua opçao: ");
		int opcao = dado.nextInt();
		 int valor1 = 0;
		 int valor2 = 0;
		System.out.println("");
		if(opcao == 4) {
			
		}else {
			System.out.print("Informe o PRIMEIRO valor: ");
			valor1 = dado.nextInt();
		
			System.out.print("Informe o SEGUNDO valor: ");
			valor2 = dado.nextInt();
		}
		switch (opcao) {
		case 1:
			if(valor1 % valor2 == 0) {
			
			System.out.println("O valor é multiplo pelo outro");
			}else {
				
				System.out.println("O valor não é multiplo pelo outro");
				
			}
			break;

		case 2:

			if (valor1 % 2 == 0 && valor2 % 2 ==0) {
				
				System.out.println("Os valores são pares");
				
			} else {
				
				System.out.println("Um ou os dois valores são impares");
				
			}
			
			break;

		case 3:

			double media = (valor1 + valor2) / 2;
			if(media == 7) {
				
				System.out.println("A média dos valores é 7");
			break;	
			}else {
				
				System.out.println("A média dos valores não é 7");
				
			}

		case 4:
			System.exit(0);
			break;
			
			
		default:
			
			System.out.println("Opçao inválida");

			break;
		}
		
		dado.close();
		
		System.exit(0);

	}

}
