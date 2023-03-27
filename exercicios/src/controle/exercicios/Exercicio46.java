package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

////Jogo da adivinhacao: 
//Tentar adivinhar um numero entre 0 - 100. 
//Armazene um numero aleatorio em uma variavel. 
//O Jogador tem 10 tentativas para adivinhar o numero gerado. 
//Ao final de cada tentativa, imprima a quantidade de tentativas restantes, 
//e imprima se o numero inserido e maior ou menor do que o numero armazenado.

public class Exercicio46 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		  int continuar;
		  int numeroSorteado;
		  int tentativas;
		  int numero;

		  do {
		   System.out.println("Sorteando numero entre 0 e 100...\n");
		   Random numeroAleatorio = new Random();
		   numeroSorteado = numeroAleatorio.nextInt(101);

		   System.out.println("Come�ou o jogo! Sera que consegue me vencer?");
		   tentativas = 0;

		   do {
		    tentativas++;
		    System.out.printf("Tentativa %d: ", tentativas);
		    numero = scanner.nextInt();

		    if (numero > numeroSorteado) {

		     System.out.printf("\nO numero sorteado e menor que %d\n\n", numero);

		    } else if (numero < numeroSorteado) {

		     System.out.printf("\nO numero sorteado e maior que %d\n\n", numero);

		    } else {

		     System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);
		     break;
		    }

		   } while (tentativas != 10);

		   System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
		   continuar = scanner.nextInt();

		  } while (continuar != 0);

		  scanner.close();
		 }
		}