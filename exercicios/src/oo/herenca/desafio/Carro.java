package oo.herenca.desafio;

public class Carro {

	int velocidadeAtual;

	void acelerar() {
		velocidadeAtual += 5;
	}

	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual � " + velocidadeAtual + "Km/h";
	}
}
