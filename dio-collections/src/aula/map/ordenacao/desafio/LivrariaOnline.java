package aula.map.ordenacao.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
	private Map<String, Livro> livrariaOnline;
	
	public LivrariaOnline() {
		this.livrariaOnline = new HashMap<>();
	}

	public void adicionarLivro(String link, Livro livro) {
		livrariaOnline.put(link, livro);
	}
	
	public void removerLivro(String titulo) {
		List<String> chavesRemover = new ArrayList<>();
		for (Map.Entry<String, Livro> livro : livrariaOnline.entrySet()) {
			if(livro.getValue().getTitulo().equalsIgnoreCase(titulo)) {
				chavesRemover.add(livro.getKey());
			}
		}
		for (String chave : chavesRemover) {
			livrariaOnline.remove(chave);
		}
	}
	
	public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
		List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaOnline.entrySet());
		Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
		Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
		for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
			livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
		}
		return livrosOrdenadosPorPreco;
	}
	
	public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
		Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
		for (Map.Entry<String, Livro> entry : livrariaOnline.entrySet()) {
			Livro livro = entry.getValue();
			if(entry.getValue().getAutor().equalsIgnoreCase(autor)) {
				livrosPorAutor.put(autor, livro);
			}
		}
		return livrosPorAutor;
	}
	
	public Livro obterLivroMaisCaro() {
		Livro livroMaisCaro = null;
		double precoMaisCaro = Double.MIN_VALUE;
		if(!livrariaOnline.isEmpty()) {
			for (Livro livro : livrariaOnline.values()) {
				if(livro.getPreco() > precoMaisCaro) {
					precoMaisCaro = livro.getPreco();
					livroMaisCaro = livro;
				}
			}
		}
		return livroMaisCaro;
	}
}
