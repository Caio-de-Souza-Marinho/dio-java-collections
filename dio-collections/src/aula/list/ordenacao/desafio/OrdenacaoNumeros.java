package aula.list.ordenacao.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> listaNumeros;
	
	public OrdenacaoNumeros() {
		this.listaNumeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}

	public List<Integer> ordenarAscendente() {
		List<Integer> listaNumerosAscendente = new ArrayList<>(this.listaNumeros);
		if (!listaNumeros.isEmpty()) {
			Collections.sort(listaNumerosAscendente);
			return listaNumerosAscendente;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
	}

	public List<Integer> ordenarDescendente() {
		List<Integer> listaNumerosAscendente = new ArrayList<>(this.listaNumeros);
		if (!listaNumeros.isEmpty()) {
			listaNumerosAscendente.sort(Collections.reverseOrder());
			return listaNumerosAscendente;
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
