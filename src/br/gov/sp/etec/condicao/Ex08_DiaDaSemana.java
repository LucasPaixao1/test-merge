package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex08_DiaDaSemana {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe um valor de acordo com um dia da semana: ");
		int dia = dado.nextInt();
			
			switch(dia) {
			case 1:
			
				System.out.println("O dia da semana equivalente ao valor �: Domingo");
				break;
			
			case 2:
			
				System.out.println("O dia da semana equivalente ao valor �: Segunda-Feira");
				break;
			
			case 3:
			
				System.out.println("O dia da semana equivalente ao valor �: Ter�a-Feira");
				break;
				
			case 4:
			
				System.out.println("O dia da semana equivalente ao valor �: Quarta-Feira");
				break;
			
			case 5:
				
				System.out.println("O dia da semana equivalente ao valor �: Quinta-Feira");
				break;
			
			case 6:	
				
				System.out.println("O dia da semana equivalente ao valor �: Sexta-Feira");
				break;	
				
			case 7:	
				
				System.out.println("O dia da semana equivalente ao valor �: S�bado");
				break;
				
			default:
				System.out.println("Dia Invalido");
				break;
		}
		dado.close();

	}

}
