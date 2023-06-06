package operadores.logico.relacional.condicional.java;

public class PriemeiraClasse {
	
	public static void main(String[] args) {
		
		double nota1 = 6.0;	
		double nota2 = 7.7;
		double nota3 = 5.8;
		double media = 0.0;
		
		media = (nota1 + nota2 + nota3) / 4;
		
		if (media >= 7.0) {
			System.out.println("Aluno Aprovado: " + media);
		}else if (media >= 4.0 && media <= 6.9) {
			System.out.println("Aluno de Recuperação: " + media);
		}else {
			System.out.println("Aluno Reprovado" + media);
		}
		
	}

}
