package aula.map.operacoesbasicas.desafio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	private Map<String, String> dicionario;

	public Dicionario() {
		this.dicionario = new HashMap<>();
	}

	public void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}

	public void removerPalavra(String palavra) {
		if (!dicionario.isEmpty()) {
			dicionario.remove(palavra);
		}
	}

	public void exibirPalavras() {
		System.out.println(dicionario);
	}

	public String pesquisarPorPalavra(String palavra) {
		String palavraPesquisa = null;
		if (!dicionario.isEmpty()) {
			palavraPesquisa = dicionario.get(palavra);
		}
		return palavraPesquisa;
	}
}