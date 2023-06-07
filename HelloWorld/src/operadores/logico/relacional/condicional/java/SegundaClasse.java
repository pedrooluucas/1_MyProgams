package operadores.logico.relacional.condicional.java;

public class SegundaClasse {
	
	public static void main(String[] args) {
		
		int nota1 = 100;
		int nota2 = 90;
		int nota3 = 88;
		int media = 0;

		media = (nota1 + nota2 + nota3) / 3;
		
		
		/*Operações Logicas Aninhadas: São Operações dentro de Operações*/
		
		if(media >= 50) {
			if(media >= 70) {
				if(media >= 90) {
					System.out.println("Aluno Aprovado Direto - Parabéns: " + media);
				}else {
					System.out.println("Aluno Aprovado: " + media);
				}
			}else {
				System.out.println("Aluno está em Recuperação: " + media);
			}
		}else {
			System.out.println("Aluno Reprovado Direto: " + media);
		}	
	}
	
}
