package operadores.logico.relacional.condicional.java;

public class PriemeiraClasse {

	public static void main(String[] args) {

		int nota1 = 100;
		int nota2 = 80;
		int nota3 = 78;
		int media = 0;

		media = (nota1 + nota2 + nota3) / 3;

		/* Condições Logicas com IF e ELSE */
		if (media >= 70) {
			System.out.println("Media do Aluno: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Media do Aluno: " + media);
		} else {
			System.out.println("Media do Aluno: " + media);
		}
		
		/*Operadores tenários são para micro validações*/
		
		String mediaFinal = media >= 70 ? "Aprovado no Bimestre" : "Reprovado no Bimestre"; 
		
		System.out.println(mediaFinal);
		
	}

}
