package br.gov.sp.etec.iniciar;

import java.util.Scanner;

public class Ex10_PrecoCustoDoProduto {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe o preço de custo: R$ ");
		double custo = dado.nextDouble();
		
		System.out.print("Informe o percentual desejado: ");
		double percentual = dado.nextDouble();
		
		double a = (custo * percentual) /100;
		double venda = custo + a;
		
		System.out.println("O valor de venda será: R$ " + venda);
		
		dado.close();
	}
	
}
