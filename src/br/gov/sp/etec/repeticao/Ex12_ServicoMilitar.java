package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex12_ServicoMilitar {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int idade = 0;
		String resposta = " ", nome = " ", saude = " ", sexo = " ";

		do {

			System.out.print("Informe o seu nome: ");
			nome = dado.next();
			
			System.out.print("Informe o seu sexo: ");
			sexo = dado.next();
			
			System.out.print("Informe sua idade: ");
			idade = dado.nextInt();
			
			System.out.print("Informe a sua saude (Exelente, Regular, Ruim): ");
			saude = dado.next();

			if (sexo.toUpperCase().equals("MASCULINO") && idade >= 18 && saude.toUpperCase().equals("EXELENTE")) {
				
				System.out.println("Você " + nome + " está apto para se alistar");
			
			} else {
				
				System.out.println("Você " + nome + " não está apto para se alistar");
				
			}

			System.out.print("Deseja continuar? [S] para SIM [N] para Não: ");
			resposta = dado.next();

			System.out.println("");
			System.out.println("============================================================================================");
			System.out.println("");

		} while (resposta.toUpperCase().equals("S"));

		dado.close();
		System.exit(0);


	}

}
