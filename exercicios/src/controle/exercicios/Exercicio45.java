package controle.exercicios;

import java.util.Scanner;

//Refatorar o exercicio 04, utilizando a estrutura switch.

public class Exercicio45 {
	
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um numero para verificar se ele � primo: ");
		int nump2 = entrada.nextInt();
		
		for(int i = 2; i < nump2; i++) {
			if (nump2 % i == 0) {
				contadorDeDivisores++;		
			}
		}
			
		switch (contadorDeDivisores) {
		case 0:
			System.out.println(" O n�mero informado � primo!");
			break;
		default:
			System.out.println("O n�mero informado n�o � primo!");
			
		}
		
		entrada.close();
		
	}
	
}
