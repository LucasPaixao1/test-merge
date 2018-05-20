package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex11_CarangoVelho {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int ano = 0;
		double valor = 0, desconto = 0, total = 0;
		String resposta = " ";

		do {

			System.out.print("Informe o valor do veiculo: ");
			valor = dado.nextDouble();

			System.out.print("Informe o ano do veiculo: ");
			ano = dado.nextInt();

			if (ano <= 2000) {

				desconto = (valor * 12) / 100;
				total = valor - desconto;

			} else {

				desconto = (valor * 7) / 100;
				total = valor - desconto;

			}

			System.out.println("O valor a ser pago é: " + total);

			System.out.print("Deseja continuar? [S] para SIM [N] para Não: ");
			resposta = dado.next();

			System.out.println("");
			System.out.println("============================================================================================");
			System.out.println("");

		} while (resposta.toUpperCase().equals("S"));

		dado.close();
		System.exit(0);

	}

}
