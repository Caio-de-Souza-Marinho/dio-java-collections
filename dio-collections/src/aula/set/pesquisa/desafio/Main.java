package aula.set.pesquisa.desafio;

/*
2. Lista de Tarefas
Crie uma classe chamada "ListaTarefas" que possui um conjunto 
de objetos do tipo "Tarefa" como atributo. Cada tarefa possui 
um atributo de descrição e um atributo booleano para indicar se 
a tarefa foi concluída ou não. Implemente os seguintes métodos:

adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.

removerTarefa(String descricao): Remove uma tarefa do Set de acordo com 
a descrição, se estiver presente.

exibirTarefas(): Exibe todas as tarefas da lista de tarefas.

contarTarefas(): Conta o número total de tarefas na lista de tarefas.

obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.

obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.

marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída 
de acordo com a descrição.

marcarTarefaPendente(String descricao): Marca uma tarefa como pendente 
de acordo com a descrição.
limparListaTarefas(): Remove todas as tarefas da lista de tarefas.
 */

public class Main {

	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();

		// Exibindo lista de tarefas
		listaTarefas.exibirTarefas();

		// Adicionando tarefas na lista
		System.out.println("Adicionando tarefas na lista");
		listaTarefas.adicionarTarefa("Ir no mercado");
		listaTarefas.adicionarTarefa("Trabalhar");
		listaTarefas.adicionarTarefa("Estudar");
		listaTarefas.adicionarTarefa("Comer");
		listaTarefas.adicionarTarefa("Beber água");
		listaTarefas.adicionarTarefa("Treinar");

		// Contando quantas tarefas existem na lista
		listaTarefas.exibirTarefas();
		System.out.println("Você tem " + listaTarefas.contarTarefas() + " tarefas na lista");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

		// Removendo uma tarefa da lista
		System.out.println("Removendo uma tarefa da lista");
		listaTarefas.removerTarefa("Ir no mercado");
		listaTarefas.exibirTarefas();
		System.out.println("Você tem " + listaTarefas.contarTarefas() + " tarefas na lista");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

		// Mudando status das tarefas
		System.out.println("Mudando a tarefa 'Trabalhar' e 'Estudar' para concluída e 'Ir no mercado' para pendente");
		listaTarefas.marcarTarefaConcluida("Trabalhar");
		listaTarefas.marcarTarefaConcluida("Estudar");
		listaTarefas.marcarTarefaPendente("Ir no mercado");
		listaTarefas.exibirTarefas();
		System.out.println("Você tem " + listaTarefas.contarTarefas() + " tarefas na lista");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

		// Mostrando lista de tarefas concluídas e pendentes
		System.out.println("Lista de tarefas concluídas");
		System.out.println(listaTarefas.obterTarefasConcluidas());
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Lista de tarefas pendentes");
		System.out.println(listaTarefas.obterTarefasPendentes());
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

		// Excluindo tarefas da lista
		System.out.println("Excluindo todas as tarefas da lista");
		listaTarefas.limparListaTarefas();
		listaTarefas.exibirTarefas();
	}
}