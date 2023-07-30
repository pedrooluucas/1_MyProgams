package operadores.logico.relacional.condicional.java;

import javax.swing.*;

public class EntradaDeDados {
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog(" Imforme a Quantidade de Carros ");
		String pessoas = JOptionPane.showInputDialog(" Imforme a Quantidade de Pessoas ");
		
		double carrosNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carrosNumero / pessoasNumero);
		
		double resto = carrosNumero % pessoasNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, " Divisão para as pessoas deu " + divisao + " carros para cada ");
		} else {
			System.out.println("Não quiz Receber o Resultado Final da Divisão!");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver oque sobrou ?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, " Sobrou " + resto + " carros.");
		} else {
			System.out.println("Não quiz Receber o Resultado Final do oque Sobrou!");
		}
		
	}
}
