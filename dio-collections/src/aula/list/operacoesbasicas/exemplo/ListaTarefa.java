package aula.list.operacoesbasicas.exemplo;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	private List<Tarefa> listaTarefa;

	public ListaTarefa() {
		this.listaTarefa = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		listaTarefa.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> listaTarefaRemover = new ArrayList<>();
		for (Tarefa tarefa : listaTarefa) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				listaTarefaRemover.add(tarefa);
			}
		}
		listaTarefa.removeAll(listaTarefaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return listaTarefa.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(listaTarefa);
	}
}