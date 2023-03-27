package arrays;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de notas que ser�o informadas: ");
		int qtdeNotas = entrada.nextInt();
		
		double[] notas = new double [qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
//		System.out.println(Arrays.toString(notas)); // apenas para mostrar os valores
	
	    
	    double totalNotas = 0;
	    for (double nota: notas) {
	    	totalNotas += nota;
			
		}
	    
	    double media = totalNotas / notas.length;
	    System.out.print("A m�dia �: " + media);
		
		
		entrada.close();
	}

}
