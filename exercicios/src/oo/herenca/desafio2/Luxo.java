package oo.herenca.desafio2;

public interface Luxo {
	
	void ligarAr();
	void desligarAr();
	
	default int velocidadeDoAr() {
		return 1;
	}

}
