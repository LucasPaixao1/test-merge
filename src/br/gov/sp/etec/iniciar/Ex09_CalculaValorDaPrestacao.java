package br.gov.sp.etec.iniciar;

import java.util.Scanner;

public class Ex09_CalculaValorDaPrestacao {
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);

		System.out.print("Informe o valor da compra: R$ ");
		double valor = dados.nextInt();
		
		double prestacao = valor / 5;
		
		System.out.println("O valor das pretações será: R$ " + prestacao);
		
		dados.close();
		
	}

}
