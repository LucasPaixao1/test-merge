package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex08_DiaDaSemana {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe um valor de acordo com um dia da semana: ");
		int dia = dado.nextInt();
			
			switch(dia) {
			case 1:
			
				System.out.println("O dia da semana equivalente ao valor é: Domingo");
				break;
			
			case 2:
			
				System.out.println("O dia da semana equivalente ao valor é: Segunda-Feira");
				break;
			
			case 3:
			
				System.out.println("O dia da semana equivalente ao valor é: Terça-Feira");
				break;
				
			case 4:
			
				System.out.println("O dia da semana equivalente ao valor é: Quarta-Feira");
				break;
			
			case 5:
				
				System.out.println("O dia da semana equivalente ao valor é: Quinta-Feira");
				break;
			
			case 6:	
				
				System.out.println("O dia da semana equivalente ao valor é: Sexta-Feira");
				break;	
				
			case 7:	
				
				System.out.println("O dia da semana equivalente ao valor é: Sábado");
				break;
				
			default:
				System.out.println("Dia Invalido");
				break;
		}
		dado.close();

	}

}
