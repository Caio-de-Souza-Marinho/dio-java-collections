package aula.set.operacoesbasicas.exemplo;

/*
1. Conjunto de Convidados
Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado"
como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

adicionarConvidado(String nome, int codigoConvite): Adiciona um convidado ao conjunto.

removerConvidadoPorCodigoConvite(int codigoConvite): Remove um convidado do conjunto com base no código do convite.

contarConvidados(): Conta o número total de convidados no Set.

exibirConvidados(): Exibe todos os convidados do conjunto.
 */

public class Main {

	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println(
				"Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

		conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

		conjuntoConvidados.exibirConvidados();
		System.out.println(
				"Exixtem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

		conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

		conjuntoConvidados.exibirConvidados();

		System.out.println(
				"Exixtem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
	}

}