package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex11_ValorDaVenda {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		double desconto = 0;
		double total = 0;
		System.out.println("*********************************");
		System.out.println("*      FORMAS DE PAGAMENTO      *");
		System.out.println("*********************************");
		System.out.println("* 1 - A Vista                   *");
		System.out.println("* 2 - A Prazo de 30 dias        *"); 
		System.out.println("* 3 - A Prazo de 60 dias        *");
		System.out.println("* 4 - A Prazo de 90 dias        *");
		System.out.println("* 5 - Cartao de Debito          *");
		System.out.println("* 6 - Cartao de Crédito         *");
		System.out.println("*********************************");
		
		System.out.println("");

		System.out.print("Informe sua opçao: ");
		int opcao = dado.nextInt();

		System.out.println("");

		System.out.print("Informe o valor de venda: ");
		double valor = dado.nextDouble();

		switch (opcao) {
		case 1:

			desconto = (valor * 10) / 100;
			total = valor - desconto;

			System.out.println("O valor final é: " + total);
			
			break;

		case 2:

			desconto = (valor * 5) / 100;
			total = valor - desconto;

			System.out.println("O valor final é: " + total);
			
			break;

		case 3:

			System.out.println("Nao há desconto. O valor final é: " + valor);
			
			break;

		case 4:

			desconto = (valor * 5) / 100;
			total = valor - desconto;

			System.out.println("O valor final é: " + total);

			break;
		case 5:

			desconto = (valor * 8) / 100;
			total = valor - desconto;

			System.out.println("O valor final é: " + total);

			break;
		case 6:

			desconto = (valor * 7) / 100;
			total = valor - desconto;

			System.out.println("O valor final é: " + total);

			break;
			
		default:
			
			System.out.println("Opçao inválida");

			break;
		}
		
		dado.close();
		
		System.exit(0);

	}

}
