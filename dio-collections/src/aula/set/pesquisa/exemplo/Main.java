package aula.set.pesquisa.exemplo;

/*
1. Agenda de Contatos
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo 
"Contato" como atributo. Cada contato possui atributos como nome e número de telefone. 
Implemente os seguintes métodos:

adicionarContato(String nome, int numero): Adiciona um contato à agenda.

exibirContatos(): Exibe todos os contatos da agenda.

pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma conjunto 
com os contatos encontrados.

atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de telefone 
de um contato específico.
 */

public class Main {
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();

		agendaContatos.exibirContatos();

		agendaContatos.adicionarContato("Caio", 123456);
		agendaContatos.adicionarContato("Caio", 256345);
		agendaContatos.adicionarContato("Caio Marinho", 1111111);
		agendaContatos.adicionarContato("Caio Um", 678931);
		agendaContatos.adicionarContato("Teste", 123456);

		agendaContatos.exibirContatos();

		System.out.println("Pesquisando o contato 'Teste' " + agendaContatos.pesquisarPorNome("Teste"));

		System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Teste", 1));

		agendaContatos.exibirContatos();
	}
}