package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex15_SituacaoAluno {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe o nome do aluno: ");
		String nome = dado.next();

		System.out.println("");

		System.out.print("Informe a 1ª nota do aluno: ");
		double nota1 = dado.nextDouble();

		System.out.println("");

		System.out.print("Informe a 2ª nota do aluno: ");
		double nota2 = dado.nextDouble();	
		
		System.out.println("");

		System.out.print("Informe a 3ª nota do aluno: ");
		double nota3 = dado.nextDouble();
		
		double media= (nota1 + nota2 + nota3) / 3;
		if(media >= 7) {
			
			System.out.println("O aluno: " + nome + " teve a média de: " + media + " e foi APROVADO");
			
		}else if(media <= 5) {
			
			System.out.println("O aluno: " + nome + " teve a média de: " + media + " e foi REPROVADO");
			
		}else {
			
			System.out.println("O aluno: " + nome + " teve a média de: " + media + " ficou de RECUPERAÇÃO");
			
		}
			dado.close();
	}

}
