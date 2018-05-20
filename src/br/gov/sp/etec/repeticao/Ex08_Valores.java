package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex08_Valores {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int valor = 0, valorMaior = 1, valorMenor = 80000000, acumulo = 0;
		double media = 0;
		
		for(int cont = 1; cont <= 10; cont++) {
			System.out.print("Informe um valor positivo: ");
			valor = dado.nextInt();

			if (valor > valorMaior) {

				valorMaior = valor;

			} else if (valor < valorMenor) {

					valorMenor = valor;
					
			}
			
			acumulo += valor;
		}
		
		media = acumulo / 10;

		System.out.println("O maior valor foi: " + valorMaior);
		System.out.println("O menor valor foi: " + valorMenor);
		System.out.println("A media dos valores foi: " + media);

		dado.close();
		System.exit(0);

	}

}
