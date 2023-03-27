package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
	    c1.ligar();
	    System.out.println(c1.estaLigado());
	    
	    System.out.println(c1.motor.giros());
	    
	    c1.acelerar();
	    c1.acelerar();
	    c1.acelerar();
	    c1.acelerar();
	    
	    System.out.println(c1.motor.giros());
	    
	    c1.frear();
	    c1.frear();
	    c1.frear();
	    c1.frear();
	    
	    // Faltou Encapsulmaneto -> futuras aulas
	   // c1.motor.fatorInjecao = -30;  * possibilidade
	    
	    System.out.println(c1.motor.giros());
	    
	    //Relação bidirecional * desnecessário o tanto de repetição, apenas um teste
	    System.out.println(c1.motor.carro.motor.carro.motor.giros());
	}

}
