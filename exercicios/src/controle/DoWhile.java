package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		//if (....) senten�a; ou {}
		//while (....) seten�a; ou {}
		// for(...;...;...) senten�a; ou {}
		
		//do senten�a; ou {} while(...);
		
		Scanner teclado = new Scanner (System.in);
		
		String texto = ""; // aqui pode por o valor da condi��o "por favor" que mesmo assim ele inicia o programa. 
		
		do {
			System.out.println("Voc� precisa falar"
					+ "as palavras m�gicas...");
			System.out.println("Quer sair? ");
			texto = teclado.nextLine();
		}while (!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigada!");
		teclado.close();
	}
	

}
