package br.gov.sp.etec.repeticao;

public class Ex02_NumerosImparesEntre100E200 {

	public static void main(String[] args) {
		int cont = 100;
		
		
		while (cont <= 200) {
			if(cont % 2 != 0) {
			System.out.println(cont);
			}
			cont++;

		}
		
		
		System.exit(0);

	}

}
