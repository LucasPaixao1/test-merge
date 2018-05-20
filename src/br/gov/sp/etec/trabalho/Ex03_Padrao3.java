package br.gov.sp.etec.trabalho;

public class Ex03_Padrao3 {

	public static void main(String[] args) {
		for (int cont = 1; cont <= 100; cont++) {
			if (cont % 4 == 0) {
				System.out.println("PI");
			} else {
				System.out.println(cont);
			}

		}
		System.exit(0);
	}
}
