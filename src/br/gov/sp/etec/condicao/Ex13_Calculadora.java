package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex13_Calculadora {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int resultado = 0;
		
		System.out.println("*********************");
		System.out.println("*    CALCULADORA    *");
		System.out.println("*********************");
		System.out.println("* 1 - SOMA          *");
		System.out.println("* 2 - SUBTRA�AO     *"); 
		System.out.println("* 3 - MULTIPLICA�AO *");
		System.out.println("* 4 - DIVISAO       *");
		System.out.println("*********************");
		
		System.out.println("");

		System.out.print("Informe sua op�ao: ");
		int opcao = dado.nextInt();

		System.out.println("");

		System.out.print("Informe o PRIMEIRO valor: ");
		int valor1 = dado.nextInt();
		
		System.out.print("Informe o SEGUNDO valor: ");
		int valor2 = dado.nextInt();

		switch (opcao) {
		case 1:
			resultado = valor1 + valor2;
			
			System.out.println("O valor da soma �: " + resultado);
			
			break;

		case 2:

			resultado = valor1 - valor2;
			
			System.out.println("O valor da subtra�ao �: " + resultado);
			
			break;

		case 3:

			resultado = valor1 * valor2;
			
			System.out.println("O valor da multiplica�ao �: " + resultado);
			
			break;

		case 4:

			resultado = valor1 / valor2;
			
			System.out.println("O valor da divisao �: " + resultado);
			
			break;

			
		default:
			
			System.out.println("Op�ao inv�lida");

			break;
		}
		
		dado.close();
		
		System.exit(0);
	}

}
