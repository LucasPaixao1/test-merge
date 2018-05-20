package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex15_PositivoNegativoouZero {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int valor = 0;
		String resposta = "";

		do {
			System.out.print("Informe um valor: ");
			valor = dado.nextInt();
			
			if (valor > 0){

				System.out.println("Positivo");

			}else if(valor < 0){
				
				System.out.println("Negativo");
				
			}else {
				
				System.out.println("Igual a 0");
				
			}

			System.out.print("Deseja continuar? [S] para SIM [N] para Não: ");
			resposta = dado.next();

			System.out.println("");
			System.out.println("============================================================================================");
			System.out.println("");

		} while (resposta.toUpperCase().equals("S"));

		dado.close();
		System.exit(0);

	}

}
