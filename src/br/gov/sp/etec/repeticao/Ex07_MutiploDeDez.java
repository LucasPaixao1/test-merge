package br.gov.sp.etec.repeticao;

public class Ex07_MutiploDeDez {

	public static void main(String[] args) {
		for (int cont = 1; cont <= 100; cont++) {
			if (cont % 10 == 0) {
				System.out.println("Mutiplo de 10");
			} else {
				System.out.println(cont);
			}

		}
		System.exit(0);

	}

}
