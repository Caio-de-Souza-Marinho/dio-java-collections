package aula.set.pesquisa.desafio;

import java.util.Objects;

public class Tarefa {
	private String descricao;
	private boolean concluida;

	// Construtor
	public Tarefa(String descricao, boolean concluida) {
		this.descricao = descricao;
		this.concluida = concluida;
	}

	// Getters
	public String getDescricao() {
		return descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	// Setters
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public String toString() {
		return "[" + descricao + ", " + concluida + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}
}