package aula.list.pesquisa.exemplo;

/*
1. Catálogo de Livros
Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui 
atributos como título, autor e ano de publicação. Implemente os seguintes métodos:

adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.

pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.

pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo de anos 
e retorna uma lista com os livros encontrados.

pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.
 */

public class Main {

	public static void main(String[] args) {
		// Criando uma instância do catálogo de livros
		CatalogoLivros catalogoLivros = new CatalogoLivros();

		// Adicionando livros ao catálogo
		catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
		catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
		catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
		catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
		
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2020));
		
		System.out.println(catalogoLivros.pesquisarPorTitulo("Código Limpo"));
	}
}