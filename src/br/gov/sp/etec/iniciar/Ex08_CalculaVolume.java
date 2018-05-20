package br.gov.sp.etec.iniciar;

import java.util.Scanner;

public class Ex08_CalculaVolume {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor do raio do cilindro: ");
		double R = entrada.nextDouble();
		
		System.out.print("Informe o valor da altura cilindro: ");
		double A = entrada.nextDouble();
		
		double V = 3.14159 * R * R * A;
		
		System.out.println("O volume do cilindro é: " + V);
		
		entrada.close();
		
		
	}
}
