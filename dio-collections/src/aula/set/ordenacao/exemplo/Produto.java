package aula.set.ordenacao.exemplo;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	private int codigo;
	private String nome;
	private int quantidade;
	private double preco;

	// Construtor
	public Produto(int codigo, String nome, int quantidade, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	// Getters
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "[" + codigo + ", " + nome + ", " + quantidade + ", " + preco + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

	@Override
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}
}

class ComparatorPorPreco implements Comparator<Produto> {
	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
}