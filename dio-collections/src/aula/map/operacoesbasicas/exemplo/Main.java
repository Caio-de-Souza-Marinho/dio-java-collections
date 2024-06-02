package aula.map.operacoesbasicas.exemplo;

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