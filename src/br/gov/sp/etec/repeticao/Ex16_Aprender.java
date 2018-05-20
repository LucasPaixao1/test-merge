package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex16_Aprender {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		String resposta;
		
		int aulas = 0;
		double total = 0;
		do {
			
			System.out.println("****************");
			System.out.println("*     MENU     *");
			System.out.println("****************");
			System.out.println("* 1 – Nivel 1  *");
			System.out.println("* 2 – Nivel 2  *");
			System.out.println("* 3 – Nivel 3  *");
			System.out.println("****************");

			System.out.println("");

			System.out.print("Informe o nivel da aula: ");
			int opcao = dado.nextInt();
 
			switch (opcao) {
			case 1:
				System.out.print("Informe o numero de aulas: ");
				aulas = dado.nextInt();

				total = 12 * aulas;
				
				System.out.println("O total a receber é: " + total);
				
				break;

			case 2:
				System.out.print("Informe o numero de aulas: ");
				aulas = dado.nextInt();

				total = 17 * aulas;
				
				System.out.println("O total a receber é: " + total);
				
				break;
			case 3:
				System.out.print("Informe o numero de aulas: ");
				aulas = dado.nextInt();

				total = 25 * aulas;
				
				System.out.println("O total a receber é: " + total);
				
				break;

			default:

				System.out.println("Opçao inválida");

				break;
			}
			
			System.out.print("Deseja continuar? (S) para SIM (N) para NÃO: ");
			resposta = dado.next();
			
			System.out.println("");
			System.out.println("============================================================================================");
			System.out.println("");


		} while (resposta.toUpperCase().equals("S"));

		dado.close();

		System.exit(0);

	}

}
