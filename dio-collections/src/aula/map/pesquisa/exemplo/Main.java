package aula.map.pesquisa.exemplo;

public class Main {

	public static void main(String[] args) {
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.exibirProdutos();
		estoqueProdutos.adicionarProduto(1, "Carne", 2, 35);
		estoqueProdutos.adicionarProduto(2, "Batata", 15, 2);
		estoqueProdutos.adicionarProduto(3, "Pão", 5, 1);
		estoqueProdutos.adicionarProduto(4, "Água", 4, 5);
		estoqueProdutos.exibirProdutos();
		
		System.out.println("Valor total do estoque é: " + estoqueProdutos.calcularValorTotalEstoque());
		System.out.println("O produto mais caro do estoque é: " + estoqueProdutos.obterProdutoMaisCaro());
		System.out.println("O produto mais barato do estoque é: " + estoqueProdutos.obterProdutoMaisBarato());
		System.out.println("O produto com maior valor no estoque é: " + estoqueProdutos.obterProdutoMaiorValorEstoque());
	}
}