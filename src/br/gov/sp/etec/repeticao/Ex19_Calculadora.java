package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex19_Calculadora {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		String resposta;
		int resultado = 0;

		do {

			System.out.println("*********************");
			System.out.println("*    CALCULADORA    *");
			System.out.println("*********************");
			System.out.println("* 1 - SOMA          *");
			System.out.println("* 2 - SUBTRAÇAO     *");
			System.out.println("* 3 - MULTIPLICAÇAO *");
			System.out.println("* 4 - DIVISAO       *");
			System.out.println("*********************");

			System.out.println("");

			System.out.print("Informe sua opçao: ");
			int opcao = dado.nextInt();

			System.out.println("");

			System.out.print("Informe o PRIMEIRO valor: ");
			int valor1 = dado.nextInt();

			System.out.print("Informe o SEGUNDO valor: ");
			int valor2 = dado.nextInt();

			switch (opcao) {
			case 1:
				resultado = valor1 + valor2;

				System.out.println("O valor da soma é: " + resultado);

				break;

			case 2:

				resultado = valor1 - valor2;

				System.out.println("O valor da subtraçao é: " + resultado);

				break;

			case 3:

				resultado = valor1 * valor2;

				System.out.println("O valor da multiplicaçao é: " + resultado);

				break;

			case 4:

				resultado = valor1 / valor2;

				System.out.println("O valor da divisao é: " + resultado);

				break;

			default:

				System.out.println("Opçao inválida");

				break;
			}

			System.out.print("Deseja continuar? (S) para SIM (N) para NÃO: ");
			resposta = dado.next();

			System.out.println("");
			System.out.println(
					"============================================================================================");
			System.out.println("");

		} while (resposta.toUpperCase().equals("S"));

		dado.close();

		System.exit(0);

	}

}
