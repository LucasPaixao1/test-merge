package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex12_Times {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe o nome do time da casa: ");
		String time1 = dado.next();

		System.out.println("");

		System.out.print("Informe o nome do time visitante: ");
		String time2 = dado.next();

		System.out.println("");

		System.out.print("Informe o número de gols feitos pelo time da casa: ");
		int time1Gols = dado.nextInt();		
		
		System.out.println("");

		System.out.print("Informe o número de gols feitos pelo time visitante: ");
		int time2Gols = dado.nextInt();
		
		if(time1Gols > time2Gols){
			
			System.out.println("");
			System.out.println("O time vencedor foi: " + time1 + ". com o placar de: " + time1Gols +" x " + time2Gols);
			
		}else if(time1Gols < time2Gols) {
			
			System.out.println("");
			System.out.println("O time vencedor foi: " + time2 + ". com o placar de: " + time1Gols +" x " + time2Gols);
			
		}else {
			
			System.out.println("");
			System.out.println("Nao houve time vencedor o placar foi de: " + time1 + " " + time1Gols +" x " + time2Gols + " " + time2);
			
		}
		
		dado.close();
		
		System.exit(0);
	}

}
