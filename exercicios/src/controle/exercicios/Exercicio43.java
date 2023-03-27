package controle.exercicios;

import java.util.Scanner;

////Criar um programa que receba duas notas parciais, calcular a media final.
//Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
//se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperacao",
//caso contrario imprime no console "Reprovado".

public class Exercicio43 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a primeira nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/2;
		System.out.println("Sua m�dia foi de " + media +"\n");
		
		if (media >= 7) {
			System.out.println("Aluno aprovado!");
		}else if (media < 7 && media > 4) {
			System.out.println("Aluno em recupera��o!");
		}else {
			System.out.println("Aluno reprovado!");
		}
		
		entrada.close();
	}

}
