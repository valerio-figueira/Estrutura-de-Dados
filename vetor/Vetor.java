package vetor;

public class Vetor {
	private String[] elementos;
	private int posicao;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.posicao = 0;
	}

	public void adicionaExemplo1(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}

	public void adicionaExemplo2(String elemento) throws Exception {
		if (posicao < elementos.length) {
			elementos[posicao] = elemento;
			posicao++;
		} else {
			throw new Exception("Vetor já está cheio");
		}
	}

	public boolean adiciona(String elemento) {
		if (posicao < elementos.length) {
			elementos[posicao] = elemento;
			posicao++;
			return true;
		} else {
			System.err.println("Sem capacidade no vetor.");
			return false;
		}
	}

	public boolean adiciona(int posicao, String elemento) {
		if (!(posicao >= 0 && posicao < this.posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}

		// mover os elementos
		for (int i = this.posicao - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.posicao++;
		
		return true;
	}

	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < this.elementos.length)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		return this.elementos[posicao];
	}

	public int busca(String elemento) {
		for (int i = 0; i < this.posicao; i++) {
			if (elementos[i].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public String toString() {
		String s = "Elementos: ";
		int i = 0;
		for (String listar : this.elementos) {
			i++;
			s += listar;
			if (i == this.elementos.length) {
				s += ".";
			} else {
				s += ", ";
			}
		}
		return s;
	}
}
