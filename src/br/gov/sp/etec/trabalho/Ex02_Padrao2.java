package br.gov.sp.etec.trabalho;

public class Ex02_Padrao2 {

	public static void main(String[] args) {
		for(int cont = 0; cont <= 100; cont++) {
			if(cont % 2 == 0) {
				System.out.println("**");
			}else {
				System.out.println("*");
			}
		}
		System.exit(0);

	}

}
