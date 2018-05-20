package br.gov.sp.etec.oo;

import java.util.Scanner;

public class Ex56OOMain {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		System.out.print("Informe um valor: ");

		if (new Ex56OO().parOuImpar(dado.nextInt())) {
			System.out.println("Par.");
		} else {

			System.out.println("Impar.");

		}

		dado.close();
		System.exit(0);
	}

}
