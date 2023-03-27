package controle;

import java.util.Scanner;

//calcular a média das notas de uma turma, 
//sem saber a quantidade total de alunos.
//usuario vai digitar uma nota válida de 10 à 0.
//armazer o valor dessa nota em uma variavel chamada total, 
//sempre acrescentando cada nova nota.
//e outra variavel para mostrar quantas notas válidas foram digitadas
//para sair do programa digitar -1


public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double nota = 0;
		double total = 0;
		int quantidadeDeNotas = 0;
		
		while(nota != -1) {
			System.out.println("Digite uma nota (ou -1 para sair): ");
			nota = teclado.nextDouble();
		
			if(nota>= 0 && nota <= 10) {
				total += nota;
				quantidadeDeNotas++;
			} else if (nota != -1) {
				System.out.println("Digite um nota válida!!!!");
			}	
		}
		// calcular média:
		
		double m1 = total / quantidadeDeNotas;
		System.out.println("A média é: " + m1);
		
		teclado.close();
		
		
	}

}
