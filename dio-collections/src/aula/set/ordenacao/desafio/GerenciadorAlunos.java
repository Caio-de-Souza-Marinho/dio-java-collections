package aula.set.ordenacao.desafio;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	private Set<Aluno> gerenciadorAlunos;

	public GerenciadorAlunos() {
		this.gerenciadorAlunos = new HashSet<>();
	}

	public void adicionarAluno(String nome, int matricula, double media) {
		gerenciadorAlunos.add(new Aluno(nome, matricula, media));
	}

	public void removerAluno(int matricula) {
		Aluno alunoRemover = null;
		if (!gerenciadorAlunos.isEmpty()) {
			for (Aluno aluno : gerenciadorAlunos) {
				if (aluno.getMatricula() == matricula) {
					alunoRemover = aluno;
				}
			}
			gerenciadorAlunos.remove(alunoRemover);
		} else {
			System.out.println("O gerenciador nao contém nenhum aluno");
		}

		if (alunoRemover == null) {
			System.out.println("Mátricula não encontrada");
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> gerenciadorAlunosPorNome = new TreeSet <>(gerenciadorAlunos);	
		return gerenciadorAlunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> gerenciadorAlunosPorNota = new TreeSet <>(new ComparatorPorMedia());	
		gerenciadorAlunosPorNota.addAll(gerenciadorAlunos);
		return gerenciadorAlunosPorNota;
	}
	
	public void exibirAlunos() {
		System.out.println(gerenciadorAlunos);
	}
}
