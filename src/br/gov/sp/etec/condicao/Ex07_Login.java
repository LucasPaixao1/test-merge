package br.gov.sp.etec.condicao;

import java.util.Scanner;

public class Ex07_Login {
	public static void main(String[] args) {
		
		String login = "Astrobirobaldo";
		String minhaSenha = "993777551";
		
		Scanner dado = new Scanner(System.in);
		
		System.out.print("Informe o login: ");
		String loginDigitado = dado.next();
		
		System.out.print("Informe a senha: ");
		String senhaDigitada = dado.next();
		
		if (senhaDigitada.equals(minhaSenha) && login.equals(loginDigitado)) {
			
			System.out.println("Acesso Permitido");
			
		} else {
			
			System.out.println("Acesso não permitido");
			
		}
		
		dado.close();

	}
}
