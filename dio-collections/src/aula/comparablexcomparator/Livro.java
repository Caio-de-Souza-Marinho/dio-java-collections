package aula.comparablexcomparator;

import java.util.Comparator;

// Uma classe 'Livro' que implementa Comparable
class Livro implements Comparable<Livro> {
	private String titulo;
	private String autor;
	private int ano;

	// Construtor
	public Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}

	// Métodos getters para acessar os dados privados
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}

	// Usado para ordenar livros por titulo
	public int compareTo(Livro l) {
		return titulo.compareTo(l.titulo);
	}
}

// Classe para comparar livro por autor que implementa Comparator
class CompararAutor implements Comparator<Livro> {
	@Override
	public int compare(Livro l1, Livro l2) {
		return l1.getAutor().compareTo(l2.getAutor());
	}
}

// Classe para comparar livro por ano que implementa Comparator
class CompararAno implements Comparator<Livro> {
	@Override
	public int compare(Livro l1, Livro l2) {
		return Integer.compare(l1.getAno(), l2.getAno());
	}
}

// Classe para comparar livro por ano depois autor e depois livro, que implementa Comparator
class CompararAnoAutorTitulo implements Comparator<Livro> {
	@Override
	public int compare(Livro l1, Livro l2) {
		int ano = Integer.compare(l1.getAno(), l2.getAno());
		if (ano != 0)
			return ano;
		int autor = l1.getAutor().compareTo(l2.getAutor());
		if (autor != 0)
			return autor;
		return l1.getTitulo().compareTo(l2.getTitulo());
	}
}