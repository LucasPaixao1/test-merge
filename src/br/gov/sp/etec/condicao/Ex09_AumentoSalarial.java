package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex09_AumentoSalarial {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		System.out.print("Informe seu salario: ");
		double salario = dado.nextDouble();

		if (salario <= 600) {
			double aumento = (salario * 30) / 100;
			double total = salario + aumento;
			System.out.println("O seu salario total e: " + total);

		} else if (salario <= 1100.00) {
			double aumento = (salario * 25) / 100;
			double total = salario + aumento;
			System.out.println("O seu salario total e: " + total);

		} else if (salario <= 2400.00) {
			double aumento = (salario * 20) / 100;
			double total = salario + aumento;
			System.out.println("O seu salario total e: " + total);

		} else {
			double aumento = (salario * 15) / 100;
			double total = salario + aumento;
			System.out.println("O seu salario total e: " + total);

		}
		dado.close();
		
		System.exit(0);
	}

}
