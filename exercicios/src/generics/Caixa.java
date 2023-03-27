package generics;

public class Caixa<T> { // pode ser qualquer definição de nome

	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}

	public T abrir() {
		return coisa;

	}

}
