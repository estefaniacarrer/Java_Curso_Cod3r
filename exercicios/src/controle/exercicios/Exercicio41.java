package controle.exercicios;

import java.util.Scanner;

// Criar um programa que receba um numero e
//verifique se ele está entre 0 e 10 e e par;

public class Exercicio41 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			 if (numero % 2 == 0) {
			     System.out.println("O número pertence ao intervalo 0 e 10 e é par!");
		     }else {
			     System.out.println("O número pertence ao intervalo 0 e 10, porém não é par!");
		     }
		}else {
			System.out.println("O número não pertence ao intervalo 0 e 10!");
		}
		
		entrada.close();
	
	}

}

