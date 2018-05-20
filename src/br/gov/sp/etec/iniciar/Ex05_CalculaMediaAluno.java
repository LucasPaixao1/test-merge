package br.gov.sp.etec.iniciar;

import java.util.Scanner;

public class Ex05_CalculaMediaAluno {
	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Nome do aluno: ");
		String nome = dado.nextLine();

		
		System.out.print("Informe a primeira nota do aluno: ");
		double	nota1 = dado.nextDouble();
		
		System.out.print("Informe a segunda nota do aluno: ");
		double	nota2 = dado.nextDouble();
		
		System.out.print("Informe a terceira nota do aluno: ");
		double	nota3 = dado.nextDouble();
		
		double media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("O aluno " + nome + ", teve a media: " + media);

		dado.close();
	}
}
