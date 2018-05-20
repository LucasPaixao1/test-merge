package br.gov.sp.etec.teste;

public class TesteFor {

	public static void main(String[] args) {

		for (int cont = 0; cont <= 10; cont++) {

			System.out.println(cont);

			if (cont == 5) {
				
				break;
			}
			
			if(cont == 10) {
				continue;
			}
			
			while(true) {
				
				break;
				
			}
			
			do {
				
				continue;
				
			}while(false);
		}

	}

}
