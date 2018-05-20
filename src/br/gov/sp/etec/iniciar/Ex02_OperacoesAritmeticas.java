package br.gov.sp.etec.iniciar;

import java.util.Scanner;

public class Ex02_OperacoesAritmeticas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o primeiro valor: ");
		double valor1 = teclado.nextDouble();

		System.out.print("Informe o segundo valor: ");
		double valor2 = teclado.nextDouble();

		double soma = valor1 + valor2;
		double multi = valor1 * valor2;
		double sub = valor1 - valor2;
		double divi = valor1 / valor2;

		System.out.println("Soma: " + soma);
		System.out.println("Multi: " + multi);
		System.out.println("Sub: " + sub);
		System.out.println("Divi: " + divi);
		
		teclado.close();

	}

}
