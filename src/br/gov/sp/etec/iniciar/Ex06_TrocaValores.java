package br.gov.sp.etec.iniciar;

import java.util.Scanner;

public class Ex06_TrocaValores {

	public static void main(String[] args) {

		Scanner valores = new Scanner(System.in);
		
		System.out.print("Informe o valor da variavel A: ");
		int a = valores.nextInt();
		
		System.out.print("Informe o valor da variavel B: ");
		int b = valores.nextInt();
		
		int c = b;
		b = a;
		a = c;
		
		System.out.println("Os valores foram trocados\n A = " + a + "\nB = " + b);
		
		valores.close();

	}

}
