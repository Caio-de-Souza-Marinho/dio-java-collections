package aula.list.ordenacao.desafio;

public class Main {

	public static void main(String[] args) {
		// Criando uma instância da classe OrdenacaoNumeros
		OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();

		// Adicionando números na lista e exibindo
		listaNumeros.adicionarNumero(36);
		listaNumeros.adicionarNumero(73);
		listaNumeros.adicionarNumero(67);
		listaNumeros.adicionarNumero(13);
		listaNumeros.adicionarNumero(18);
		listaNumeros.exibirNumeros();

		// Ordenando os números em ordem ascendente
		System.out.println(listaNumeros.ordenarAscendente());

		// Ordenando os números em ordem descendente
		System.out.println(listaNumeros.ordenarDescendente());
	}

}