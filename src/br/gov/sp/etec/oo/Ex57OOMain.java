package br.gov.sp.etec.oo;

import javax.swing.JOptionPane;

public class Ex57OOMain {

	public static void main(String[] args) {

		String txt = JOptionPane.showInputDialog("Informe o dia da semana desejado: ");
		int dia = Integer.parseInt(txt);
		
		JOptionPane.showMessageDialog(null,Ex57OO.getDescricaoDiaSemana(dia));

		System.exit(0);

	}

}
