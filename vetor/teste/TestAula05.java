package vetor.teste;

import vetor.Vetor;

public class TestAula05 {

	public static void main(String[] args) {
		Vetor v = new Vetor(5);

		v.adicionaExemplo1("1º Elemento");
		v.adicionaExemplo1("2º Elemento");
		v.adicionaExemplo1("3º Elemento");

		System.out.println(v.busca(1));
		System.out.println(v.busca(5));
		System.out.println(v.busca(15));
	}
}
