package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex18_CienciaDaComputacao {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		String resposta;
	
		do {
			
			System.out.print("Informe a nota da avaliaçao em laboratorio: ");
			double nlab = dado.nextDouble();
			
			System.out.print("Informe a nota da avaliaçao semestral: ");
			double nsem = dado.nextDouble();
			
			System.out.print("Informe a nota da avaliaçao final: ");
			double nfin = dado.nextDouble();
			
			double media = (nlab*2 + nsem*3 + nfin*5)/10; 
			
			System.out.println("A média final do aluno foi: " + media);
			
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
