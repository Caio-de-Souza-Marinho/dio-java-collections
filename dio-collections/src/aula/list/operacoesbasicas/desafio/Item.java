package aula.list.operacoesbasicas.desafio;

public class Item {
	private String nome;
	private int quantidade;
	private double preco;

	// Construtor
	public Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Item [nome = " + nome + ", quantidade = " + quantidade + ", preco = " + preco + "]";
	}
}