package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex02_Diferenca {
	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int v1 = dado.nextInt();
		
		System.out.print("Informe outro valor: ");
		int v2 = dado.nextInt();
		
		int diferenca = 0;
		
		if (v1 > v2) {
			
			diferenca = v1 - v2;
			System.out.println("A diferença entre os valores é: " + diferenca);
			
		} else {
			
			diferenca = v2 - v1;
			System.out.println("A diferença entre os valores é: " + diferenca);
			
		}
		
		dado.close();
	
	}
}
