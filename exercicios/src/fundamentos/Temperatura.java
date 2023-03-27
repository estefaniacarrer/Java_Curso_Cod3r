package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// (ºF - 32) x 5/9 = ºC
		
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double f = 86;
		double c = (f - AJUSTE) * FATOR;
		System.out.println(" O resultado e " + c + " graus Celsius");
		
		f = 150;
		c = (f - AJUSTE) * FATOR;
		System.out.println(" O resultado e " + c + " graus Celsius");
		
		
	}

}
