package aula.map.ordenacao.exemplo;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();

		agendaEventos.exibirAgenda();
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 30), "Evento 1", "Atração 1");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.MAY, 2), "Evento 2", "Atração 2");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 5), "Evento 3", "Atração 3");
		agendaEventos.exibirAgenda();

		agendaEventos.obterProximoEvento();
	}
}