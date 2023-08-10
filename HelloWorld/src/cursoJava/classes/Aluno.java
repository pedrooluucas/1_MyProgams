package cursoJava.classes;

public class Aluno {
	
	/*Esses são os atributos do Aluno*/
	
	public String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMaticulado;
	
	public Aluno() { /*Cria os dados na memoria do java por padrão*/
		
	}
	
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
