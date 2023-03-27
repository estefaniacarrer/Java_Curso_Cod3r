package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {  // resolvido com lambdas
	
	public static void main(String[] args) {
		
		// não depende de "Calculo"
		// não permite conversão direta: int primitivo -> Double tipo classe , inserir .0 nos numeros
		
		BinaryOperator<Double> calc = (x, y)-> {return x + y; };
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y;  // segunda forma de fazer
		System.out.println(calc.apply(2.0,3.0));
		
		BinaryOperator<Integer> calc2 = (x, y)-> {return x + y; };
		System.out.println(calc2.apply(2, 3));
		
		calc = (x, y) -> x * y;  // segunda forma de fazer
		System.out.println(calc2.apply(2, 3));
		
	}

}
