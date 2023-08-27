package cursoJava.executavel;

import cursoJava.classes.Aluno;

public class Alunos {

	public static void main(String[] args) {
		
		/*new Aluno() é uma instancia (Criação de Objetos)*/
		/*as variaveis são uma referencia para o objeto Aluno*/
		
		
		Aluno aluno1 = new Aluno(); /*Aqui será Pedro*/
		aluno1.setNome("Pedro Lucas Almeida de Oliveira");
		aluno1.setIdade(13);
		aluno1.setDataNascimento("28/01/2010");
		aluno1.setRegistroGeral("1543.9878.6754");
		aluno1.setNumeroCpf("1253.9847.6743.11");
		aluno1.setNomeMae("Amanda Gonçalves de Almeida");
		aluno1.setNomePai("Wyltamar Douglas de Sousa Oliveira");
		aluno1.setDataMatricula("10/01/2020");
		aluno1.setNomeEscola("E.M.E.F João Rosado de Oliveira");
		aluno1.setSerieMaticulado("8 Ano");
		aluno1.setNota1(9.5);
		aluno1.setNota2(8.7);
		aluno1.setNota3(7.4);
		aluno1.setNota4(10.0);
		
		System.out.println("O Nome do Aluno é = " + aluno1.getNome());
		System.out.println("A idade do Aluno é = " + aluno1.getIdade());
		System.out.println("A Data de Nascimento do Aluno é = " + aluno1.getDataNascimento());
		System.out.println("O RG do Aluno é = " + aluno1.getRegistroGeral());
		System.out.println("O CPF do Aluno é = " + aluno1.getNumeroCpf());
		System.out.println("A Mãe do Aluno é = " + aluno1.getNomeMae());
		System.out.println("O Pai do Aluno é = " + aluno1.getNomePai());
		System.out.println("A Data da Matricula do Aluno é = " + aluno1.getDataMatricula());
		System.out.println("O Nome da Escola do Aluno é = " + aluno1.getNomeEscola());
		System.out.println("A Serie Matriculada do Aluno é = " + aluno1.getSerieMaticulado());
		System.out.println("A Media Bimestral do Aluno é: " + aluno1.getMediaBimestre());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		/*============================================================================================*/
		
		System.out.println("---------------------------------------------------------------------------");
		
		Aluno aluno2 = new Aluno(); /*Aqui será Wyltamar*/
		aluno2.setNome("Wyltamar Douglas de Sousa Oliveira");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("3/06/1997");
		aluno2.setRegistroGeral("1543.9878.6754");
		aluno2.setNumeroCpf("1253.9847.6743.11");
		aluno2.setNomeMae("Maria do Socorro");
		aluno2.setNomePai("Atonio Oliveira");
		aluno2.setDataMatricula("10/07/2020");
		aluno2.setNomeEscola("E.M JDEV Treinamento");
		aluno2.setSerieMaticulado("3 Fase");
		aluno2.setNota1(9.8);
		aluno2.setNota2(8.5);
		aluno2.setNota3(10.0);
		aluno2.setNota4(10.0);
		
		System.out.println("O Nome do Aluno é = " + aluno2.getNome());
		System.out.println("A idade do Aluno é = " + aluno2.getIdade());
		System.out.println("A Data de Nascimento do Aluno é = " + aluno2.getDataNascimento());
		System.out.println("O RG do Aluno é = " + aluno2.getRegistroGeral());
		System.out.println("O CPF do Aluno é = " + aluno2.getNumeroCpf());
		System.out.println("A Mãe do Aluno é = " + aluno2.getNomeMae());
		System.out.println("O Pai do Aluno é = " + aluno2.getNomePai());
		System.out.println("A Data da Matricula do Aluno é = " + aluno2.getDataMatricula());
		System.out.println("O Nome da Escola do Aluno é = " + aluno2.getNomeEscola());
		System.out.println("A Serie Matriculada do Aluno é = " + aluno2.getSerieMaticulado());
		System.out.println("A Media Bimestral do Aluno é: " + aluno2.getMediaBimestre());
		System.out.println("Resultado = " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		/*============================================================================================*/
		
		Aluno aluno3 = new Aluno(); /*Aqui será Yuri*/
		
		Aluno aluno4 = new Aluno("Amanda");
		
		Aluno aluno5 = new Aluno("José", 58);

	}

}
