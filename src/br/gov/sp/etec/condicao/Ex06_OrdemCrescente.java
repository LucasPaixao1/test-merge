package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex06_OrdemCrescente {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int a = dado.nextInt();
		
		System.out.print("Informe outro valor: ");
		int b = dado.nextInt();
		
		int c = 0;
		
		if (a > b) {
			
			c = a;
			a = b;
			b = c;
			System.out.println("Os valores estão em ordem crescente:  " + a + ", " + b);
			
		} else {
			
			System.out.println("Os valores estão em ordem crescente:  " + a + ", " + b);
			
		}
		
		dado.close();

	}

}
