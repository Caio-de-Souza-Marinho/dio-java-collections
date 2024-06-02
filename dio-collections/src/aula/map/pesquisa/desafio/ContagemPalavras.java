package aula.map.pesquisa.desafio;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	private Map<String, Integer> palavrasMap;

	public ContagemPalavras() {
		super();
		this.palavrasMap = new HashMap<>();
	}

	public void adicionarPalavra(String palavra, Integer contagem) {
		palavrasMap.put(palavra, contagem);
	}

	public void removerPalavra(String palavra) {
		if (!palavrasMap.isEmpty()) {
			palavrasMap.remove(palavra);
		}
	}

	public void exibirPalavras() {
		System.out.println(palavrasMap);
	}

	public String encontrarPalavraMaisFrequente() {
		String palavraMaisFrequente = null;
		int maiorContagem = 0;
		for (Map.Entry<String, Integer> palavra : palavrasMap.entrySet()) {
			if (palavra.getValue() > maiorContagem) {
				maiorContagem = palavra.getValue();
				palavraMaisFrequente = palavra.getKey();
			}
		}
		return palavraMaisFrequente;
	}
}