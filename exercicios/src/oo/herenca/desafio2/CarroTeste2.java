package oo.herenca.desafio2;

public class CarroTeste2 {
	
	public static void main(String[] args) {
		
		Civic2 c1 = new Civic2();
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		System.out.println();
		
		Ferrari2 c2 = new Ferrari2(400);
		c2.ligarTurbo();
		//c2.ligarAr();
		
		System.out.println("Velocidade do ar é igual à: "+ c2.velocidadeDoAr());
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
	}

}
