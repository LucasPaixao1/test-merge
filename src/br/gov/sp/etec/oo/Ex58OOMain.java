package br.gov.sp.etec.oo;

import javax.swing.JOptionPane;

public class Ex58OOMain {

	public static void main(String[] args) {
		
		Ex58OO ex58OO = new Ex58OO();
		
		String txt = JOptionPane.showInputDialog("Informe o salario do funcionario: ");
		double salario = Double.parseDouble(txt);
		
		JOptionPane.showMessageDialog(null,"O salário total do funcionario é: " + ex58OO.calculaAumentoSalarial(salario));

		System.exit(0);

	}

}
