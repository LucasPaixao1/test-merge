package br.gov.sp.etec.oo;

public class Ex58OO {
	
	public double calculaAumentoSalarial(double salario){
		
		if (salario <= 600) {
			double aumento = (salario * 30) / 100;
			double total = salario + aumento;
			return total;

		} else if (salario <= 1100.00) {
			double aumento = (salario * 25) / 100;
			double total = salario + aumento;
			return total;

		} else if (salario <= 2400.00) {
			double aumento = (salario * 20) / 100;
			double total = salario + aumento;
			return total;

		} else {
			double aumento = (salario * 15) / 100;
			double total = salario + aumento;
			return total;

		}
		
	}

}
