package br.gov.sp.etec.iniciar;

import java.util.Scanner;

public class Ex07_CalculaComissaoVendedor {

	public static void main(String[] args) {
		
		
		Scanner dado = new Scanner(System.in);
		
		System.out.println();
		
		System.out.print("Informe a matricula do funcionario: ");
		int mat = dado.nextInt();
		
		System.out.println();
		
		System.out.print("Informe o nome do funcionario: ");
		String nome = dado.next();
		
		System.out.println();
		
		System.out.print("Informe o codigo da peca: ");
		int codigo = dado.nextInt();
		
		System.out.println();
		
		System.out.print("Informe a descricao da peca: ");
		String descricao = dado.next();
		
		System.out.println();
		
		System.out.print("Informe o preco unitario da peca: ");
		double preco = dado.nextDouble();
		
		System.out.println();
		
		System.out.print("Informe a quantidade vendida: ");
		int quantidade = dado.nextInt();
		
		System.out.println();
		
		double valorVendas = preco * quantidade;
		double comicao = (valorVendas * 5)/100 ;
		
		System.out.println();
		System.out.println();
		
		System.out.println("O vendedor: " + nome);
		System.out.println("Da matricula: " + mat);
		System.out.println("Vendeu a peca do codigo: " + codigo);
		System.out.println("Com a descrição: " + descricao);
		System.out.println("Que tem o valor de: R$  " + preco);
		System.out.println("Quantidade vendida: " + quantidade);
		System.out.println("E teve a comicao de: R$ " + comicao);
		
		dado.close();

	}

}
