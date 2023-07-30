package operadores.logico.relacional.condicional.java;

public class SextaClasse {

	public static void main(String[] args) {
		
		/*Estrutura de Repetição FOR e Continue*/
		
		for (int numero = 0; numero <= 10; numero++) {
			if(numero == 3 || numero == 6 || numero == 9) {
				System.out.println(" Achei o Numero" + numero);
				continue;
			}
			System.out.println(" Processando Numero... ");
		}
	}
	
}
