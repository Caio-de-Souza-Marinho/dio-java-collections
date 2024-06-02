package aula.set.ordenacao.desafio;

/*
2. Lista de Alunos
Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
exibirAlunos(): Exibe todos os alunos do conjunto.
 */

public class Main {

	public static void main(String[] args) {
		GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

		gerenciadorAlunos.exibirAlunos();

		gerenciadorAlunos.adicionarAluno("Joao", 1, 7.0);
		gerenciadorAlunos.adicionarAluno("Maria", 2, 8.0);
		gerenciadorAlunos.adicionarAluno("Ze", 3, 2.0);
		gerenciadorAlunos.adicionarAluno("Fatima", 4, 1.0);
		gerenciadorAlunos.exibirAlunos();

		System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
		System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

		gerenciadorAlunos.removerAluno(3);
		gerenciadorAlunos.exibirAlunos();
	}

}