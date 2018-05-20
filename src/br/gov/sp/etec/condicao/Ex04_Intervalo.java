package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex04_Intervalo {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int v1 = dado.nextInt();
		
		if (v1 >= 0 && v1 <= 9) {
			
			System.out.println("Valor válido");
			
		} else {
			
			System.out.println("Valor Inválido");
			
		}
		
		dado.close();

	}

}
