package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex05_MediaAlunos {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		String resposta = " ";
		int rm = 0;
		String nome = " ";
		int cont = 0;
		double media = 0; 
		double acumulo = 0;
		
		do {
			System.out.println("");
			
			cont++;
			
			System.out.print("Informe o RM do aluno: ");
			rm = dado.nextInt();
		
			System.out.print("Informe o nome do aluno: ");
			nome = dado.next();
		
			System.out.print("Informe a nota do aluno: ");
			double nota = dado.nextDouble();
		
			
			acumulo = acumulo + nota;
			media = acumulo/cont;
			
			System.out.print("Deseja continuar? [S] para SIM [N] para NAO: ");
			resposta = dado.next();
			
			System.out.println("===============================================");
			
		}while(resposta.toUpperCase().equals("S"));
		
		System.out.println("A média da sala é: " + media);
		
		dado.close();
		System.exit(0);
		
		
	}

}
