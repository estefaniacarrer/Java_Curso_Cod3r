package fundamentos.exercicios;

import java.util.Scanner;

//Criar um programa que resolve equa��es do segundo grau 
//(ax2 + bx + c = 0) utilizando a f�rmula de Bhaskara. 
//Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Equa��o: ax� + bx + c = 0");
		
		System.out.println("Digite o valor de a: ");
		int a = teclado.nextInt();
		
		System.out.println("Digite o valor de b: ");
		int b = teclado.nextInt();
		
		System.out.println("Digite o valor de c: ");
		int c = teclado.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		
		System.out.printf("\nSua equacao e: %dx� + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO delta �: " + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("O x1 da equacao �: %.2f", x1);
		
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("\nO x2 da equacao �: %.2f", x2);
		
		teclado.close();
		
	}

}
