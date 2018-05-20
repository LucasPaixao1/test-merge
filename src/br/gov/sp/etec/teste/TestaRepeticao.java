package br.gov.sp.etec.teste;

public class TestaRepeticao {
	public static void main(String[] args) {
		int cont = 1;

		while (cont <= 100) {

			System.out.println(cont);
			cont++;
		}

		System.out
				.println("------------------------------------------------------------------------------------------");
		cont = 1;

		do {

			System.out.println(cont);
			cont++;

		} while (cont <= 100);

		System.out
				.println("------------------------------------------------------------------------------------------");

		for (cont = 1; cont <= 100; cont++) {

			System.out.println(cont);

		}

		System.exit(0);
	}
}
