package aula.map.operacoesbasicas.desafio;

/*
2. Dicionário
Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.
exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
 */

public class Main {

	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();

		dicionario.exibirPalavras();
		dicionario.adicionarPalavra("desaprovado",
				"Que foi alvo de desaprovação; que não se conseguiu aprovar; em que há rejeição: projeto desaprovado.");
		dicionario.adicionarPalavra("acintosamente",
				"De modo acintoso; feito com maldade ou para fazer o mal: olhou acintosamente para os convidados.");
		dicionario.adicionarPalavra("melhoras",
				"Votos de uma boa recuperação, especialmente na saúde: foi ao hospital para lhe desejar as melhoras.");
		dicionario.exibirPalavras();

		dicionario.removerPalavra("desaprovado");
		dicionario.exibirPalavras();

		System.out.println(dicionario.pesquisarPorPalavra("melhoras"));
	}
}