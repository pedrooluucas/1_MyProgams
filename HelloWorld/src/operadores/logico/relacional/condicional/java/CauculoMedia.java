package operadores.logico.relacional.condicional.java;

import javax.swing.JOptionPane;

public class CauculoMedia {

	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog(" Imforme sua 1 Nota ");
		String nota2 = JOptionPane.showInputDialog(" Imforme sua 2 Nota ");
		String nota3 = JOptionPane.showInputDialog(" Imforme sua 3 Nota ");
		String nota4 = JOptionPane.showInputDialog(" Imforme sua 4 Nota ");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		if (media >= 5.0) {
			
			if (media >=7.0) {
				JOptionPane.showMessageDialog(null, " Aluno Aprovado com Media: " + media);
			} else {
				JOptionPane.showMessageDialog(null, " Aluno de Recuperação com Media: " + media);
			}
			
		} else {
			JOptionPane.showMessageDialog(null, " Aluno Reprovado Direto com Media: " + media);
		}

	}

}
