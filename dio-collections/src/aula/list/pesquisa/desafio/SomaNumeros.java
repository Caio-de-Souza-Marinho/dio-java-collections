package aula.list.pesquisa.desafio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> listaNumeros;

	// Construtor
	public SomaNumeros() {
		this.listaNumeros = new ArrayList<>();
	}

	public void adicionarNumeros(int numero) {
		listaNumeros.add(numero);
	}

	public int calcularSoma() {
		int valorTotal = 0;
		for (Integer numero : listaNumeros) {
			valorTotal += numero;
		}
		return valorTotal;
	}

	public int encontrarMaiorValor() {
		Integer maiorNumero = Integer.MIN_VALUE;
		if (!listaNumeros.isEmpty()) {
			for (Integer numero : listaNumeros) {
				if (numero >= maiorNumero) {
					maiorNumero = numero;
				}
			}
			return maiorNumero;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
	}

	public int encontrarMenorValor() {
		Integer menorNumero = Integer.MAX_VALUE;
		if (!listaNumeros.isEmpty()) {
			for (Integer numero : listaNumeros) {
				if (numero <= menorNumero) {
					menorNumero = numero;
				}
			}
			return menorNumero;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
	}

	public void exibirNumeros() {
		if (!listaNumeros.isEmpty()) {
			System.out.println(listaNumeros);
		} else {
			throw new RuntimeException("A lista está vazia");
		}
	}
}