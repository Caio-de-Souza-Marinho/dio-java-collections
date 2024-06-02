package aula.set.ordenacao.exemplo;

/*
1. Cadastro de Produtos
Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Implemente os seguintes métodos:

adicionarProduto(long cod, String nome, double preco, int quantidade): Adiciona um produto ao cadastro.
exibirProdutosPorNome(): Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço.
 */

public class Main {
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();

		cadastroProdutos.adicionarProduto(1, "TV", 1, 2500.0);
		cadastroProdutos.adicionarProduto(2, "Celular", 2, 2600.0);
		cadastroProdutos.adicionarProduto(3, "Geladeira", 1, 4500.0);
		cadastroProdutos.adicionarProduto(4, "Microondas", 2, 500.0);

		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	}
}