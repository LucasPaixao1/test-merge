package br.gov.sp.etec.iniciar;

import java.util.Scanner;

public class Ex04_RealizaCotacaoDolarParaReal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a cotacao do dolar: R$ ");
		double cotacao = teclado.nextDouble();
		
		System.out.print("Informe o valor em dolar: R$ ");
		double valor1 = teclado.nextDouble();
		
		double real = valor1 * cotacao;

		System.out.println("O valor convertido e: R $" + real);
		
		teclado.close();

	}

}
