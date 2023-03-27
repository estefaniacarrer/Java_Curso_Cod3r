package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		//Ler num1
		//Ler num2
		// + - * / %
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe o numero: ");
		double num1 = teclado.nextDouble();
		
		System.out.println("Informe o numero: ");
		double num2 = teclado.nextDouble();
		
		System.out.println("Informe a operacao: ");
		String cod = teclado.next();
		
		
		double resultado = "+".equals(cod) ? num1 + num2 : 0;
		resultado = "-".equals(cod) ? num1 - num2 : resultado;
		resultado = "*".equals(cod) ? num1 * num2 : resultado;
		resultado = "/".equals(cod) ? num1 / num2 : resultado;
		resultado = "%".equals(cod) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, cod, num2, resultado);
		
		teclado.close();
	}

}
