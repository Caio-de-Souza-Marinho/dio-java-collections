package aula.map.pesquisa.desafio;

public class Main {

	public static void main(String[] args) {
		ContagemPalavras contagemPalavras = new ContagemPalavras();
		
		contagemPalavras.exibirPalavras();
		contagemPalavras.adicionarPalavra("água", 2);
		contagemPalavras.adicionarPalavra("fogo", 6);
		contagemPalavras.adicionarPalavra("ar", 2);
		contagemPalavras.adicionarPalavra("terra", 2);
		contagemPalavras.exibirPalavras();

		System.out.println("A palavra mais frequente é: " + contagemPalavras.encontrarPalavraMaisFrequente());
	}

}
