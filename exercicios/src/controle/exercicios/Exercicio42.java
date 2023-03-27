package controle.exercicios;

import java.util.Scanner;

//Criar um programa que informa se o ano atual e um ano bissexto

public class Exercicio42 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		

		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);
		
		if (bissexto == true) {
			System.out.println("O ano informado é bissexto!");
		}else {
			System.out.println("O ano informado não é bissexto!");
		}
		
		entrada.close();
	}

}
