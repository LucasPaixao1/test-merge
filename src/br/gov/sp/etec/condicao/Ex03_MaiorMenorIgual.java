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
			
			System.out.println("Os valores s�o iguais");
			
		} else if(v1 > v2){
			
			System.out.println("O maior valor �: " + v1 + " E o menor valor �: " + v2);
			
		} else {
			
			System.out.println("O maior valor �: " + v2 + ". E o menor valor �: " + v1);
			
			
		}
		
		dado.close();

	}

}
