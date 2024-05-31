package aula.list.operacoesbasicas.desafio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> carrinhoDeCompras;

	// Construtor
	public CarrinhoDeCompras() {
		this.carrinhoDeCompras = new ArrayList<>();
	}

	public void adicionarItem(String nome, int quantidade, double preco) {
		carrinhoDeCompras.add(new Item(nome, quantidade, preco));
		System.out.println("Item " + nome + " adicionado!");
	}

	public void removerItem(String nome) {
		List<Item> carrinhoDeComprasRemover = new ArrayList<>();
		for (Item item : carrinhoDeCompras) {
			if (item.getNome().equalsIgnoreCase(nome)) {
				carrinhoDeComprasRemover.add(item);
			}
		}
		carrinhoDeCompras.removeAll(carrinhoDeComprasRemover);
		System.out.println("Item " + nome + " removido!");
	}

	public void calcularValorTotal() {
		double valorTotal = 0;
		double valorItem = 0;
		for (Item item : carrinhoDeCompras) {
			valorItem = item.getQuantidade() * item.getPreco();
			valorTotal += valorItem;
		}
		System.out.println("O valor total do carrinho é: " + valorTotal);
	}

	public void exibirItens() {
		System.out.println(carrinhoDeCompras);
	}
}
