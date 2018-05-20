package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex06_MenorMaiorValor {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int valor = 0, valorMaior = 0, valorMenor = 80000000;
		do {
			System.out.print("Informe um valor positivo: ");
			valor = dado.nextInt();

			if (valor > valorMaior) {

				valorMaior = valor;

			} else if (valor < valorMenor) {
				if (valor < 0) {

				} else {
					valorMenor = valor;
				}
			}
		} while (valor > 0);

		System.out.println("O maior valor foi: " + valorMaior);
		System.out.println("O menor valor foi: " + valorMenor);

		dado.close();
		System.exit(0);

	}

}
