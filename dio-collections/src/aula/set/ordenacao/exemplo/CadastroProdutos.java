package aula.set.ordenacao.exemplo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	Set<Produto> cadastroProdutos;

	// Construtor
	public CadastroProdutos() {
		this.cadastroProdutos = new HashSet<>();
	}

	public void adicionarProduto(int codigo, String nome, int quantidade, double preco) {
		cadastroProdutos.add(new Produto(codigo, nome, quantidade, preco));
	}

	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> cadastroProdutosPorNome = new TreeSet<>(cadastroProdutos);
		return cadastroProdutosPorNome;
	}

	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> cadastroProdutosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		cadastroProdutosPorPreco.addAll(cadastroProdutos);
		return cadastroProdutosPorPreco;
	}
}