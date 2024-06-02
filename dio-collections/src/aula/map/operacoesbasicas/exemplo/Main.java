package aula.map.operacoesbasicas.exemplo;

/*
1. Agenda de Contatos
Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um número de telefone como valor. Implemente os seguintes métodos:

adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
removerContato(String nome): Remove um contato da agenda, dado o nome do contato.
exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
 */

public class Main {

	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();

		agendaContatos.exibirContatos();

		agendaContatos.adicionarContato("Caio", 123456);
		agendaContatos.adicionarContato("Caio", 12345);
		agendaContatos.adicionarContato("Ze", 2314123);
		agendaContatos.adicionarContato("Maria", 3457896);
		agendaContatos.adicionarContato("Joao", 3459067);
		agendaContatos.exibirContatos();

		agendaContatos.removerContato("Joao");
		agendaContatos.exibirContatos();

		System.out.println(agendaContatos.pesquisarPorNome("Caio"));
	}
}