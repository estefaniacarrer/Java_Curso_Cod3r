package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		//if (....) sentença; ou {}
		//while (....) setença; ou {}
		// for(...;...;...) sentença; ou {}
		
		//do sentença; ou {} while(...);
		
		Scanner teclado = new Scanner (System.in);
		
		String texto = ""; // aqui pode por o valor da condição "por favor" que mesmo assim ele inicia o programa. 
		
		do {
			System.out.println("Você precisa falar"
					+ "as palavras mágicas...");
			System.out.println("Quer sair? ");
			texto = teclado.nextLine();
		}while (!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigada!");
		teclado.close();
	}
	

}
