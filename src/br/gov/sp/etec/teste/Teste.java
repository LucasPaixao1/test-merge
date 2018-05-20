package br.gov.sp.etec.teste;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = dado.next();
		
		System.out.print("Seja Bem Vindo " + nome);
		
		dado.close();

	}

}
