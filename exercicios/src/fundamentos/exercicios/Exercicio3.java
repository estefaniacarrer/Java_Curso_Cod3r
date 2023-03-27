package fundamentos.exercicios;

import java.util.Scanner;

//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

public class Exercicio3 {
	
	public static void main(String[] args) {
		
     Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o seu peso: ");
		double peso = teclado.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		double altura = teclado.nextDouble();
		
		double IMC = peso / (altura * altura);
		
		System.out.println("Seu IMC é: " + IMC);
		
		
		teclado.close();
		
		
	}

}
