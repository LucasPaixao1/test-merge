package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex10_ClubeFutebol {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		System.out.print("Informe seu nome: ");
		String nome = dado.next();
		
		System.out.print("Informe sua idade: ");
		int idade = dado.nextInt();

		if (idade >= 5 && idade <= 10) {
			
			System.out.println("O atleta " + nome + ", que tem " + idade + " anos . É da categoria: Infantil");

		} else if(idade <= 15) {
			
			System.out.println("O atleta " + nome + ", que tem " + idade + " anos . É da categoria: Juvenil");

		} else if (idade <= 20) {
			
			System.out.println("O atleta " + nome + ", que tem " + idade + " anos . É da categoria: Junior");
		
		} else {
			
			System.out.println("O atleta " + nome + ", que tem " + idade + " anos. É da categoria: Profissional");

		}
		dado.close();
		
		System.exit(0);

	}

}
