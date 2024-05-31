package aula.list.operacoesbasicas.desafio;

/*
2. Carrinho de Compras:
Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. 
O carrinho deve ser implementado como uma lista de itens. Cada item é representado por 
uma classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente
os seguintes métodos:

adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho 
com o nome, preço e quantidade especificados.

removerItem(String nome): Remove um item do carrinho com base no seu nome.

calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração 
o preço e a quantidade de cada item.

exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e
 quantidades.
*/

public class Main {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		carrinhoDeCompras.exibirItens();

		carrinhoDeCompras.adicionarItem("Batata", 1, 5.0);
		carrinhoDeCompras.exibirItens();
		carrinhoDeCompras.calcularValorTotal();

		carrinhoDeCompras.adicionarItem("Batata", 1, 5.0);
		carrinhoDeCompras.exibirItens();
		carrinhoDeCompras.calcularValorTotal();

		carrinhoDeCompras.adicionarItem("Abóbora", 1, 14.0);
		carrinhoDeCompras.exibirItens();
		carrinhoDeCompras.calcularValorTotal();

		carrinhoDeCompras.removerItem("Batata");
		carrinhoDeCompras.exibirItens();
		carrinhoDeCompras.calcularValorTotal();
	}

}