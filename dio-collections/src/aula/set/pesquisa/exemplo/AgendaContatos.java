package aula.set.pesquisa.exemplo;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> agendaContatos;

	public AgendaContatos() {
		this.agendaContatos = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		agendaContatos.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		if (!agendaContatos.isEmpty()) {
			System.out.println(agendaContatos);
		} else {
			System.out.println("A agenda de contatos está vazia!");
		}
	}

	public Set<Contato> pesquisarPorNome(String nomeContato) {
		Set<Contato> agendaContatosPorNome = new HashSet<>();
		if (!agendaContatos.isEmpty()) {
			for (Contato contato : agendaContatos) {
				if (contato.getNome().startsWith(nomeContato)) {
					agendaContatosPorNome.add(contato);
				}
			}
			return agendaContatosPorNome;
		} else {
			throw new RuntimeException("A agenda de contatos está vazia!");
		}
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		if (!agendaContatos.isEmpty()) {
			for (Contato contato : agendaContatos) {
				if (contato.getNome().equalsIgnoreCase(nome)) {
					contato.setNumero(novoNumero);
					contatoAtualizado = contato;
					break;
				}
			}
			return contatoAtualizado;
		} else {
			throw new RuntimeException("A agenda de contatos está vazia!");
		}
	}
}