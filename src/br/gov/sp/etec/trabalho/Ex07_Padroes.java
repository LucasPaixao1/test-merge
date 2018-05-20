package br.gov.sp.etec.trabalho;
import java.util.Scanner;

public class Ex07_Padroes {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		String resposta;
		do {
			
			System.out.println("****************");
			System.out.println("*     MENU     *");
			System.out.println("****************");
			System.out.println("* 1 – Padrão 1 *");
			System.out.println("* 2 – Padrão 2 *");
			System.out.println("* 3 – Padrão 3 *");
			System.out.println("* 4 – Padrão 4 *");
			System.out.println("* 5 – Padrão 5 *");
			System.out.println("* 6 – Padrão 6 *");
			System.out.println("****************");

			System.out.println("");

			System.out.print("Informe sua opçao: ");
			int opcao = dado.nextInt();

			switch (opcao) {
			case 1:

				for (int cont = 1; cont <= 100; cont++) {

					System.out.println(cont);

				}

				break;

			case 2:
				for (int contador = 0; contador <= 100; contador++) {
					if (contador % 2 == 0) {
						System.out.println("**");
					} else {
						System.out.println("*");
					}

					break;
				}
			case 3:
				for (int con = 1; con <= 100; con++) {
					if (con % 4 == 0) {
						System.out.println("PI");
					} else {
						System.out.println(con);
					}

				}
				break;

			case 4:
				for (int conta = 1; conta <= 5; conta++) {
					switch (conta) {
					case 1:
						System.out.println("*");
						break;
					case 2:
						System.out.println("* *");
						break;
					case 3:
						System.out.println("* * *");
						break;
					case 4:
						System.out.println("* * * *");
						break;
					case 5:
						System.out.println("* * * * *");
						break;

					}

				}

				break;

			case 5:
				for (int c = 1; c <= 4; c++) {
					switch (c) {
					case 1:
						System.out.println("*");
						break;
					case 2:
						System.out.println("* *");
						break;
					case 3:
						System.out.println("* * *");
						break;
					case 4:
						System.out.println("* * * *");
						break;

					}

				}

				for (int co = 1; co <= 4; co++) {
					switch (co) {
					case 1:
						System.out.println("*");
						break;
					case 2:
						System.out.println("* *");
						break;
					case 3:
						System.out.println("* * *");
						break;
					case 4:
						System.out.println("* * * *");
						break;
					}
				}
				break;

			case 6:
				for (int contad = 1; contad <= 5; contad++) {
					System.out.println("* * * * *");
				}

				break;

			default:

				System.out.println("Opçao inválida");

				break;
			}
			
			System.out.print("Deseja continuar? (S) para SIM (N) para NÃO: ");
			resposta = dado.next();

		} while (resposta.toUpperCase().equals("S"));

		dado.close();

		System.exit(0);
	}

}
