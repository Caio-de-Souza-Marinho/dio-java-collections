package aula.map.pesquisa.exemplo;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Integer, Produto> estoqueProdutos;

	public EstoqueProdutos() {
		this.estoqueProdutos = new HashMap<>();
	}

	public void adicionarProduto(Integer codigo, String nome, int quantidade, double preco) {
		estoqueProdutos.put(codigo, new Produto(nome, quantidade, preco));
	}

	public void exibirProdutos() {
		System.out.println(estoqueProdutos);
	}

	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if (!estoqueProdutos.isEmpty()) {
			for (Produto produto : estoqueProdutos.values()) {
				valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
			}
		}
		return valorTotalEstoque;
	}

	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutos.isEmpty()) {
			for (Produto produto : estoqueProdutos.values()) {
				if (produto.getPreco() > maiorPreco) {
					produtoMaisCaro = produto;
					maiorPreco = produto.getPreco();
				}
			}
		}
		return produtoMaisCaro;
	}

	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		if (!estoqueProdutos.isEmpty()) {
			for (Produto produto : estoqueProdutos.values()) {
				if (produto.getPreco() < menorPreco) {
					produtoMaisBarato = produto;
					menorPreco = produto.getPreco();
				}
			}
		}
		return produtoMaisBarato;
	}

	public Produto obterProdutoMaiorValorEstoque() {
		Produto produtoMaiorValor = null;
		double maiorValor = Double.MIN_VALUE;
		if (!estoqueProdutos.isEmpty()) {
			for (Produto produto : estoqueProdutos.values()) {
				if (produto.getQuantidade() * produto.getPreco() > maiorValor) {
					produtoMaiorValor = produto;
					maiorValor = produto.getQuantidade() * produto.getPreco();
				}
			}
		}
		return produtoMaiorValor;
	}
}