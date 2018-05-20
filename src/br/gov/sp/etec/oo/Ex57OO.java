package br.gov.sp.etec.oo;

public class Ex57OO {
	public static String getDescricaoDiaSemana(int dia) {

		switch (dia) {
		case 1:
		
			return "Segunda-Feira";

		case 2:
		
			return "Terça-Feira";
		
		case 3:
			
			return "Quarta-Feira";
		
		case 4:
		
			return "Quinta-Feira";
		
		case 5:
			
			return "Sexta-Feira";
		
		case 6:
			
			return "Sabado";
			
		case 7:
			
			return "Domingo";

		default:

			return "Dia Invalido";

		}

	}
}
