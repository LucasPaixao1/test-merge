package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex13_ControleDeEstoque {

	public static void main(String[] args) {

		Scanner dado = new Scanner(System.in);

		double valorCusto = 0, valorVenda = 0;
		
		for(int cont = 1; cont <= 40; cont++) {
			
			System.out.print("Informe o valor de custo do produto: ");
			valorCusto = dado.nextDouble();

			System.out.print("Informe o valor de venda do produto: ");
			valorVenda = dado.nextDouble();
			
			if (valorVenda > valorCusto){

				System.out.println("VOCE OBTEVE LUCRO");

			}else if(valorVenda < valorCusto){
				
				System.out.println("VOCE OBTEVE PREJUIZO");
				
			}else {
				
				System.out.println("VOCE OBTEVE EMPATE");
				
			}
			
			System.out.println("");
			System.out.println("============================================================================================");
			System.out.println("");
			
		}

		dado.close();
		System.exit(0);
		
	}

}
