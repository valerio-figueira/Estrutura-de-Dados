package vetor.teste;

import vetor.Vetor;

public class TestAula06 {
	public static void main(String[] args) {
		Vetor v = new Vetor(5);

		v.adicionaExemplo1("1� Elemento");
		v.adicionaExemplo1("2� Elemento");
		v.adicionaExemplo1("3� Elemento");
		
		System.out.println(v.toString());

		System.out.println(v.busca("1� Elemento"));
		System.out.println(v.busca("2� Elemento"));
		System.out.println(v.busca("5� Elemento"));
	}
}
