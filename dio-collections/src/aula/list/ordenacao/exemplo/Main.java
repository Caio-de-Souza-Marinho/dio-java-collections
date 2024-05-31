package aula.list.ordenacao.exemplo;

/*
1. Ordenação de Pessoas
Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo "Pessoa" como atributo. 
Cada pessoa possui atributos como nome, idade e altura. Implemente os seguintes métodos:

adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.

ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.

ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.
*/

public class Main {

	public static void main(String[] args) {
		// Criando uma instância da classe OrdenacaoPessoas
		OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();

		// Adicionando pessoas à lista
		listaPessoas.adicionarPessoa("Alice", 20, 1.56);
		listaPessoas.adicionarPessoa("Bob", 30, 1.80);
		listaPessoas.adicionarPessoa("Charlie", 25, 1.70);
		listaPessoas.adicionarPessoa("David", 17, 1.56);

		// Exibindo a lista de pessoas adicionadas
		listaPessoas.exibirPessoas();

		// Ordenando a lista por idade
		System.out.println(listaPessoas.ordenarPorIdade());

		// Ordenando a lista por altura
		System.out.println(listaPessoas.ordenarPorAltura());
	}
}