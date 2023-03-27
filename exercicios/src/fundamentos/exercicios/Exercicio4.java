package fundamentos.exercicios;

import java.util.Scanner;

//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um valor: ");
		double v1 = teclado.nextDouble();
		
		double v2 = Math.pow(v1, 2);
		System.out.println("Seu valor ao quadrado será: " + v2);
		
		double v3 = Math.pow(v1, 3);
		System.out.println("Seu valor ao cubo será: " + v3);
		
		
		teclado.close();
	}

}
