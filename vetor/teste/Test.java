package vetor.teste;

import vetor.Vetor;

public class Test {

	public static void main(String[] args) {
		Vetor v1 = new Vetor(5);

		v1.adicionaExemplo1("Primeiro Elemento");
		v1.adicionaExemplo1("Segundo Elemento");

		System.out.println(v1.toString());

		System.out.println();

		Vetor v2 = new Vetor(2);

		try {
			v2.adicionaExemplo2("1� elemento");
			v2.adicionaExemplo2("2� elemento");
			v2.adicionaExemplo2("3� elemento");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(v2.toString());

		System.out.println();

		Vetor v3 = new Vetor(2);

		v3.adicionaExemplo1("1� elemento");
		v3.adicionaExemplo1("2� elemento");
		v3.adicionaExemplo1("3� elemento");

		System.out.println(v3.toString());
	}

}
