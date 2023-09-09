package cursoJava.executavel;

import javax.swing.JOptionPane;

import cursoJava.classes.Aluno;

public class Alunos {

	public static void main(String[] args) {
		
		/*new Aluno() é uma instancia (Criação de Objetos)*/
		/*as variaveis são uma referencia para o objeto Aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual Nome Completo do Aluno ?");
		String idade = JOptionPane.showInputDialog("Qual Idade do Aluno");
		String dataNascimento = JOptionPane.showInputDialog("Qual a Data de Nascimento do Aluno ?");
		String rg = JOptionPane.showInputDialog("Qual o RG do Aluno ?");
		String cpf = JOptionPane.showInputDialog("Qual CPF do Aluno ?");
		String mae = JOptionPane.showInputDialog("Nome Completo da Mãe do Aluno ?");
		String pai = JOptionPane.showInputDialog("Nome Completo do Pai do Aluno ?");
		String dataMatricula = JOptionPane.showInputDialog("Qual Data da Matricula do Aluno ?");
		String escola = JOptionPane.showInputDialog("Qual Nome da Escola do Aluno ?");
		String serie = JOptionPane.showInputDialog("Qual Serie do Aluno ?");
		String not1 = JOptionPane.showInputDialog("Qual a Primeira Nota do Aluno ?");
		String not2 = JOptionPane.showInputDialog("Qual a Segunda Nota do Aluno ? ?");
		String not3 = JOptionPane.showInputDialog("Qual a Terceira Nota do Aluno ? ?");
		String not4 = JOptionPane.showInputDialog("Qual a Quarta Nota do Aluno ?");
		
		
		Aluno aluno1 = new Aluno(); /*Aqui será Pedro*/
		aluno1.setNome(nome);
		aluno1.setIdade(idade);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMaticulado(serie);
		aluno1.setNota1(Double.parseDouble(not1));
		aluno1.setNota2(Double.parseDouble(not2));
		aluno1.setNota3(Double.parseDouble(not3));
		aluno1.setNota4(Double.parseDouble(not4));
		
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

	}

}
