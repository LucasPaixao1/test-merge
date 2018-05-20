package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex04_NumerosPositivos {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		int par = 0, impar = 0, totalPar = 0, totalImpar = 0, valor = 0;

		do {
			System.out.print("Informe um valor positivo: ");
			valor = dado.nextInt();
			
			if(valor % 2 == 0) {
				
				System.out.println("O valor � par");
				par ++;
				
				totalPar += valor; 
				
			}else {
				
				System.out.println("O valor � impar");
				impar ++;
				totalImpar += valor;
			}
		}while (valor >= 0);
		
		System.out.println("");
		
		System.out.println("O total de n�meros pares foram: " + par + ". O total de n�meros impares foram: " + impar );
		System.out.println("A soma de todos os n�meros pares foi: " + totalPar + ". E a soma de todos os n�meros impares foi: " + totalImpar);
		
		dado.close();
		System.exit(0);
	}

}
