package classe;

public class AreaCirc {
		
		double raio;
		static final double PI = 3.14; // atributo statico - pertence a classe
		
		AreaCirc(double raioInicial) {
			raio = raioInicial;	
		}
		
		double area() {
			return PI * Math.pow(raio, 2);
		}
		
		static double area(double raio) { //metodo statico - pertence a classe / nao é necessário a criação de instancia
			return PI*Math.pow(raio, 2);
		}
		

}
