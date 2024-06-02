package aula.map.ordenacao.exemplo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate, Evento> agendaEventos;

	public AgendaEventos() {
		this.agendaEventos = new HashMap<>();
	}

	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		agendaEventos.put(data, new Evento(nome, atracao));
	}

	public void exibirAgenda() {
		Map<LocalDate, Evento> agendaOrdenadaPorData = new TreeMap<>(agendaEventos);
		System.out.println(agendaOrdenadaPorData);
	}

	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> agendaOrdenadaPorData = new TreeMap<>(agendaEventos);
		for (Map.Entry<LocalDate, Evento> evento : agendaOrdenadaPorData.entrySet()) {
			if (evento.getKey().isEqual(dataAtual) || evento.getKey().isAfter(dataAtual)) {
				proximaData = evento.getKey();
				proximoEvento = evento.getValue();
				System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
				break;
			}
		}
	}
}