package controle.exercicios;

import java.util.Scanner;

// Criar um programa que receba um numero e diga se ele e um numero primo.

public class Exercicio44 {
	
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("\nDigite um número para verificar se é primo: ");
		int nump = entrada.nextInt();
		
		for(int i = 2; i < nump; i++) {
			if (nump % i == 0) {
				contadorDeDivisores++;		
			}
		}
		
		if(contadorDeDivisores == 0) {
			System.out.println("\nO número é primo");
		}else {
			System.out.println("\nO número não é primo");	
		}
		    
		
		entrada.close();
		
	}

}
