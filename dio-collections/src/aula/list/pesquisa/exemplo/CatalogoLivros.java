package aula.list.pesquisa.exemplo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> catalogoLivros;

	// Construtor
	public CatalogoLivros() {
		this.catalogoLivros = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		catalogoLivros.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!catalogoLivros.isEmpty()) {
			for (Livro livro : catalogoLivros) {
				if (livro.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livro);
				}
			}
			return livrosPorAutor;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!catalogoLivros.isEmpty()) {
			for (Livro livro : catalogoLivros) {
				if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(livro);
				}
			}
			return livrosPorIntervaloAnos;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!catalogoLivros.isEmpty()) {
			for (Livro livro : catalogoLivros) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
			return livroPorTitulo;
		} else {
			throw new RuntimeException("A lista está vazia");
		}
	}
}