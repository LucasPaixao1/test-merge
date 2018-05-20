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
			System.out.println("* 1 � Padr�o 1 *");
			System.out.println("* 2 � Padr�o 2 *");
			System.out.println("* 3 � Padr�o 3 *");
			System.out.println("* 4 � Padr�o 4 *");
			System.out.println("* 5 � Padr�o 5 *");
			System.out.println("* 6 � Padr�o 6 *");
			System.out.println("****************");

			System.out.println("");

			System.out.print("Informe sua op�ao: ");
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

				System.out.println("Op�ao inv�lida");

				break;
			}
			
			System.out.print("Deseja continuar? (S) para SIM (N) para N�O: ");
			resposta = dado.next();

		} while (resposta.toUpperCase().equals("S"));

		dado.close();

		System.exit(0);
	}

}
