package fundamentos.exercicios;

import java.util.Scanner;

//Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea.

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		double vbase = teclado.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		double valtura = teclado.nextDouble();
		
		double area = (vbase * valtura)/2;
		
		System.out.println("A area do triangulo ser�: " + area);
		
		
		teclado.close();
	}

}
