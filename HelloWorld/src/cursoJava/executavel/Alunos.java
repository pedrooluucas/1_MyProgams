package cursoJava.executavel;

import cursoJava.classes.Aluno;

public class Alunos {

	public static void main(String[] args) {
		
		/*new Aluno() é uma instancia (Criação de Objetos)*/
		/*as variaveis são uma referencia para o objeto Aluno*/
		
		
		Aluno aluno1 = new Aluno(); /*Aqui será Pedro*/
		aluno1.nome = "Joao";
		
		Aluno aluno2 = new Aluno(); /*Aqui será Wyltamar*/
		
		Aluno aluno3 = new Aluno(); /*Aqui será Yuri*/
		
		Aluno aluno4 = new Aluno("Amanda");
		
		Aluno aluno5 = new Aluno("José", 58);

	}

}
