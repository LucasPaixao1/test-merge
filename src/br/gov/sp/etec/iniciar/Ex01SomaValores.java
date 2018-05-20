package br.gov.sp.etec.iniciar;

import java.util.Scanner;

public class Ex01SomaValores {
	public static void main(String[] args) {		
		
		/*1.Desenvolva uma classe java 
		 *chamada SomaValores que leia dois números inteiros 
		 *(via console) e exiba o resultado da soma dos valores informados.*/
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		int valor1 = teclado.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		int valor2 = teclado.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("A soma dos valores informados é: " + soma);
		
		teclado.close();

		
	}

}
