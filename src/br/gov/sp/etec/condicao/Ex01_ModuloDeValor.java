package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex01_ModuloDeValor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int v1 = entrada.nextInt();
		
		if (v1 >= 0) {
			
			System.out.println("O valor é: " + v1);
			
		}else {
			
			int v2 = v1 * (-1);
			
			System.out.println("O valor é: " + v2);
			
		}
		
		entrada.close();

	}

}
