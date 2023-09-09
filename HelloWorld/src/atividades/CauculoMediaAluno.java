package atividades;

import javax.swing.JOptionPane;

public class CauculoMediaAluno {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual Seu Nome?");
		
		String nota1 = JOptionPane.showInputDialog(" Imforme sua 1 Nota ");
		String nota2 = JOptionPane.showInputDialog(" Imforme sua 2 Nota ");
		String nota3 = JOptionPane.showInputDialog(" Imforme sua 3 Nota ");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		
		double media = (dNota1 + dNota2 + dNota3) / 3;
		
		if (media >= 7.0) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado");
		}else {
			JOptionPane.showMessageDialog(null, "Aluno Reprovado");
		}
		
	int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado final ?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, " O Resultado do Aluno " +  nome + " foi " + media);
		} else {
			System.out.println("Não quiz Receber o Resultado Final!");
		}
	
	}
}
