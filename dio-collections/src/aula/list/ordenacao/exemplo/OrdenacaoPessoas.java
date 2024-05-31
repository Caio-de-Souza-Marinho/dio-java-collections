package aula.list.ordenacao.exemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	private List<Pessoa> listaPessoas;

	public OrdenacaoPessoas() {
		this.listaPessoas = new ArrayList<>();
	}

	public void adicionarPessoa(String nome, int idade, double altura) {
		listaPessoas.add(new Pessoa(nome, idade, altura));
	}

	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> listaPessoasPorIdade = new ArrayList<>(listaPessoas);
		if (!listaPessoas.isEmpty()) {
			Collections.sort(listaPessoasPorIdade);
			return listaPessoasPorIdade;
		} else {
			throw new RuntimeException("A lista está vazia");
		}

	}

	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> listaPessoasPorAltura = new ArrayList<>(listaPessoas);
		if (!listaPessoas.isEmpty()) {
			Collections.sort(listaPessoasPorAltura, new ComparatorPorAltura());
			return listaPessoasPorAltura;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
	}
	
	public void exibirPessoas() {
		System.out.println(listaPessoas);
	}
}