package oo.composicao;


// exemplo de ligacao 1 para 1 - 1 motor para 1 carro

public class Motor {  
	
	final Carro carro; // não altera  - valor padrão
	boolean ligado = false;
	double fatorInjecao = 1;
	
	Motor (Carro carro) {  // construtor com parametros
		this.carro = carro;
	}
	
	int giros() {
		if (!ligado) {
			return 0;
		}else {
		return (int) Math.round(fatorInjecao * 3000); // cash "(int)"
	  }
	}
}
