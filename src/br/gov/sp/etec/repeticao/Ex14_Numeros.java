package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex14_Numeros {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int numero = 0;
		
		for(int cont = 1; cont <= 20; cont++) {
			
			System.out.print("Informe um valor: ");
			numero = dado.nextInt();
			
			if (numero > 80 || numero < 25 || numero == 40){

					System.out.println("Acertou as condiçoes!!");
				
			}
			
			System.out.println("");
			System.out.println("============================================================================================");
			System.out.println("");
			
		}

		dado.close();
		System.exit(0);

	}

}
