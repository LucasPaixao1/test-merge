package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex03_Tabuada {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe um valor entre 1 e 10: ");
		int valor = dado.nextInt();
		
		int cont = 1;
		
		while (cont <= 10) {
			
			int resultado = valor * cont;
			
			System.out.println(valor + " x " + cont +" = " + resultado);
			cont++;

		}
		
		dado.close();
		System.exit(0);

	}

}
