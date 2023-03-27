package fundamentos.exercicios;

import java.util.Scanner;

//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double tf = teclado.nextDouble();
		
		
		double tc = (tf - 32)/1.8;
		
		System.out.println("A temperatura em Celsius será: " + tc + " graus");
		
		teclado.close();
		
	}

}