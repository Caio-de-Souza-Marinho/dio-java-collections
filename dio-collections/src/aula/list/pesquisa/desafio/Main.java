package aula.list.pesquisa.desafio;

/*
2. Soma de Números
Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. 
Implemente os seguintes métodos:

adicionarNumero(int numero): Adiciona um número à lista de números.

calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.

encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.

encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.

exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.
 */

public class Main {

	public static void main(String[] args) {
		// Criando instância da classe SomaNumeros
		SomaNumeros listaNumeros = new SomaNumeros();

		// Adicionando números a lista
		listaNumeros.adicionarNumeros(-135);
		listaNumeros.adicionarNumeros(2);
		listaNumeros.adicionarNumeros(3);
		listaNumeros.adicionarNumeros(467);
		listaNumeros.adicionarNumeros(5);

		// Exibindo a lista de números adicionados
		System.out.println("Números adicionados: ");
		listaNumeros.exibirNumeros();

		// Calculando e exibindo a soma dos números na lista
		System.out.println("Soma dos números = " + listaNumeros.calcularSoma());

		// Encontrando o maior número na lista
		System.out.println("Maior número na lista = " + listaNumeros.encontrarMaiorValor());

		// Encontrando o menor número na lista
		System.out.println("Menor número na lista = " + listaNumeros.encontrarMenorValor());
	}
}