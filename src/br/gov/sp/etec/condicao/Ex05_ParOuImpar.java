package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex05_ParOuImpar {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int v1 = dado.nextInt();
		
		if (v1 % 2 == 0) {
			
			System.out.println("O valor é " + v1 + " Par");
			
		} else {
			
			System.out.println("O valor é " + v1 + " impar");
			
		}
		
		dado.close();

	}

}
