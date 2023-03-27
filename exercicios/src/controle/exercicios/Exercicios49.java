package controle.exercicios;

import java.util.Scanner;

// Crie um programa que recebe 10 valores
//e ao final imprima o maior numero.

public class Exercicios49 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int maiorValor = 0;
		int contador = 0;
		
		do {
			System.out.println("\nDigite um numero: ");
			int valor = entrada.nextInt();
			
			if(valor > maiorValor) {
				maiorValor = valor;
			}
			
			contador++;
		}while (contador != 10);
		
		System.out.println("\nO maior valor foi: " + maiorValor);
        		
		
		entrada.close();
		
		
	}

}
