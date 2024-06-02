package aula.set.pesquisa.desafio;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefa> listaTarefas;

	// Construtor
	public ListaTarefas() {
		this.listaTarefas = new HashSet<>();
	}

	public void adicionarTarefa(String descricao) {
		listaTarefas.add(new Tarefa(descricao, false));
	}

	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		if (!listaTarefas.isEmpty()) {
			for (Tarefa tarefa : listaTarefas) {
				if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover = tarefa;
				}
			}
			listaTarefas.remove(tarefaParaRemover);
		} else {
			System.out.println("A lista está vazia");
		}
	}

	public void exibirTarefas() {
		if (!listaTarefas.isEmpty()) {
			System.out.println(listaTarefas);
		} else {
			System.out.println("A lista está vazia!");
		}
	}

	public int contarTarefas() {
		return listaTarefas.size();
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> listaTarefasConcluidas = new HashSet<>();
		for (Tarefa tarefa : listaTarefas) {
			if (tarefa.isConcluida()) {
				listaTarefasConcluidas.add(tarefa);
			}
		}
		return listaTarefasConcluidas;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> listaTarefasConcluidas = new HashSet<>();
		for (Tarefa tarefa : listaTarefas) {
			if (!tarefa.isConcluida()) {
				listaTarefasConcluidas.add(tarefa);
			}
		}
		return listaTarefasConcluidas;
	}

	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa tarefa : listaTarefas) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefa.setConcluida(true);
			}
		}
	}

	public void marcarTarefaPendente(String descricao) {
		Tarefa tarefaParaMarcarComoPendente = null;
		for (Tarefa tarefa : listaTarefas) {
			if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaMarcarComoPendente = tarefa;
				break;
			}
		}
		if (tarefaParaMarcarComoPendente != null) {
			if (tarefaParaMarcarComoPendente.isConcluida()) {
				tarefaParaMarcarComoPendente.setConcluida(false);
			}
		} else {
			System.out.println("Tarefa não encontrada na lista");
		}
	}

	public void limparListaTarefas() {
		if (listaTarefas.isEmpty()) {
			System.out.println("A lista já está vazia");
		} else {
			listaTarefas.clear();
		}
	}

}