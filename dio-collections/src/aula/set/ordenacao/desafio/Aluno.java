package aula.set.ordenacao.desafio;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private int matricula;
	private double media;

	// Construtor
	public Aluno(String nome, int matricula, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public double getMedia() {
		return media;
	}

	@Override
	public String toString() {
		return "[" + nome + ", " + matricula + ", " + media + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}

	@Override
	public int compareTo(Aluno a) {
		return nome.compareToIgnoreCase(a.getNome());
	}
}

class ComparatorPorMedia implements Comparator<Aluno> {
	@Override
	public int compare(Aluno a1, Aluno a2) {
		return Double.compare(a1.getMedia(), a2.getMedia());
	}
}