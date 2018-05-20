package br.gov.sp.etec.repeticao;

import java.util.Scanner;

public class Ex20_HorasTabalhadas {
	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		double e = 0;
		String resposta;

		do{
			
			double precoHora = 10;
			double precoExcedente = precoHora * 2;

			System.out.print("Digite o código do operário: ");
			int C = dado.nextInt();

			System.out.print("Digite o número de horas trabalhadas: ");
			double n = dado.nextDouble();

			if(n > 50){
				e = n - 50;
			}

			System.out.println("\nID: "+C+"\nSalario: "+(n * precoHora)+"\nSalario excedente: "+(e * precoExcedente)+"\nSalario total: "+(e * precoExcedente + n * precoHora));
			
			
			System.out.print("Deseja encerrar o programa? (S) para SIM (N) para NÃO: ");
			resposta = dado.next();

			System.out.println("");
			System.out.println("============================================================================================");
			System.out.println("");

		} while (resposta.toUpperCase().equals("N"));

		dado.close();
		System.exit(0);
		
	}

}
