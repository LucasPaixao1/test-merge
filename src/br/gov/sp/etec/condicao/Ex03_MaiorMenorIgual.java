package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex03_MaiorMenorIgual {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int v1 = dado.nextInt();
		
		System.out.print("Informe outro valor: ");
		int v2 = dado.nextInt();
		
		if (v1 == v2) {
			
			System.out.println("Os valores são iguais");
			
		} else if(v1 > v2){
			
			System.out.println("O maior valor é: " + v1 + " E o menor valor é: " + v2);
			
		} else {
			
			System.out.println("O maior valor é: " + v2 + ". E o menor valor é: " + v1);
			
			
		}
		
		dado.close();

	}

}
