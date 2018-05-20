package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex17_Nadador {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		String resposta;
	
		do {
			
			System.out.print("Informe a idade do nadador: ");
			int idade = dado.nextInt();
			
			if(idade >= 5 && idade <=7) {
				
				System.out.println("Infantil A");
				
			}else if(idade <=10) {
				
				System.out.println("Infantil B");
				
			}else if(idade <= 13) {
				
				System.out.println("Juvenil A");
				
			}else if(idade <= 17) {
				
				System.out.println("Juvenil B");
				
			}else if(idade <= 25) {
				
				System.out.println("Senior");
				
			}else {
				
				System.out.println("Idade fora da faixa etária");
				
			}
			
			System.out.print("Deseja continuar? (S) para SIM (N) para NÃO: ");
			resposta = dado.next();
			
			System.out.println("");
			System.out.println("============================================================================================");
			System.out.println("");

		} while (resposta.toUpperCase().equals("S"));
		
		dado.close();
		System.exit(0);
		
	}

}
