package br.gov.sp.etec.iniciar;

import java.util.Scanner;

public class Ex03_CalculaEstoqueMedioPorPeca {
	public static void main(String[] args) {
	
		Scanner dado = new Scanner(System.in);
		
		System.out.print("\nInforme a quantidade minima: ");
		int quantidadeMinima = dado.nextInt();
	
		System.out.print("Informe a quantidade maxima: ");
		int quantidadeMaxima = dado.nextInt();
	
		int estoqueMedio = (quantidadeMaxima + quantidadeMinima) / 2;
	
		System.out.print("O estoque medio e: " + estoqueMedio);
		
		System.out.println();
		
		dado.close();
		
	}

}
