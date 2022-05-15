package vetor.teste;

import vetor.Vetor;

public class TestAula07 {
	public static void main(String[] args) {
		Vetor v = new Vetor(10);

		v.adiciona("B");
		v.adiciona("C");
		v.adiciona("E");
		v.adiciona("F");
		v.adiciona("G");

		System.out.println(v.toString());

		v.adiciona(0, "A");

		System.out.println(v.toString());

		v.adiciona(3, "D");

		System.out.println(v.toString());

		v.adiciona("H");

		System.out.println(v.toString());
	}
}
