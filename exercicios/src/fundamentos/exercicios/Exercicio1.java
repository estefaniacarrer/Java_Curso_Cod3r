package fundamentos.exercicios;

import java.util.Scanner;

//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double tc = teclado.nextDouble();
		
		//double tf =((tc /5)*9)+ 32;
		
		double tf = (tc * 1.8) + 32;
		System.out.println("A temperatura em Fahrenheit será: " + tf + " graus");
		
		teclado.close();
		
	}

}
