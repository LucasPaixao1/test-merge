package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex09_IntervaloEntre10E150 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);

		int valor = 0, De10A150 = 0;
		
		for(int cont = 1; cont <= 80; cont++) {
			System.out.print("Informe um valor positivo: ");
			valor = dado.nextInt();

			if (valor >= 10 && valor <= 150){

			  De10A150++;

			}
		}
		

		System.out.println("Os números que estavam entre 10 e 150 foram: " + De10A150);

		dado.close();
		System.exit(0);

	}

}
