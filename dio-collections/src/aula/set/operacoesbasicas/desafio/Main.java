package aula.set.operacoesbasicas.desafio;

/*
2. Conjunto de Palavras Únicas
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como 
atributo. Implemente os seguintes métodos:

adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.

removerPalavra(String palavra): Remove uma palavra do conjunto.

verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.

exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
 */

public class Main {

	public static void main(String[] args) {
		// Criando instância da classe ConjuntoPalavrasUnicas
		ConjuntoPalavrasUnicas conjuntoFrutas = new ConjuntoPalavrasUnicas();

		// Adicionando frutas ao conjunto e exibindo
		conjuntoFrutas.adicionarPalavras("Morango");
		conjuntoFrutas.adicionarPalavras("Abacaxi");
		conjuntoFrutas.adicionarPalavras("Uva");
		conjuntoFrutas.adicionarPalavras("Melancia");
		conjuntoFrutas.adicionarPalavras("Abacate");
		conjuntoFrutas.adicionarPalavras("Abobora");
		conjuntoFrutas.adicionarPalavras("Laranja");
		conjuntoFrutas.exibirPalavrasUnicas();

		// Removendo uma fruta do conjunto
		conjuntoFrutas.removerPalavra("Uva");
		conjuntoFrutas.exibirPalavrasUnicas();

		// Removendo uma fruta inexistente
		conjuntoFrutas.removerPalavra("Cenoura");
		conjuntoFrutas.exibirPalavrasUnicas();

		// Verificando se uma fruta está no conjunto
		System.out.println("A fruta 'Morango' está no conjunto? " + conjuntoFrutas.verificarPalavra("Morango"));

	}

}
