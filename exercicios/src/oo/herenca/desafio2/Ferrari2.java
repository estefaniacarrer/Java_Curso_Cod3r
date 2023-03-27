package oo.herenca.desafio2;

public class Ferrari2 extends Carro2 implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari2() {
		this(315);
	}
	// ou

	public Ferrari2(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
//	@Override // criar uma validação -- como eu coloquei o valor no delta ali em cima, não será necessário esse comando
//	void acelerar() {
//		velocidadeAtual += 15; // -> com a alteração "super.acelerar"
//	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
		;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}

	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		}else if(! ligarTurbo && !ligarAr) {
			return 20;
		}else {
		  return 15;
		}
	}
}
