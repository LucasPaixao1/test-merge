package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex10_MaiorDeIdade {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int idade = 0;
		
		for(int cont = 1; cont <= 75; cont++) {
			System.out.print("Informe a idade do meliante: ");
			idade = dado.nextInt();

			if (idade >= 18){

				System.out.println("MAIOR DE IDADE");

			}else {
				
				System.out.println("MENOR DE IDADE");
				
			}
		}

		dado.close();
		System.exit(0);

	}

}
