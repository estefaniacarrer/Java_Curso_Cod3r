package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu ultimo salario: ");
		String ultimo = teclado.nextLine().replace(",", "."); // replace com possibilidade de utilizar os valore com "." ou ","
		
		System.out.println("Digite o valor do seu penultimo salario: ");
		String penultimo = teclado.nextLine().replace(",", ".");
		
		System.out.println("Digite o valor do seu antepenultimo salario: ");
		String antepenultimo = teclado.nextLine().replace(",", ".");
		
		double numero1 = Double.parseDouble(ultimo); // string para um valor do tipo double
		double numero2 = Double.parseDouble(penultimo);
		double numero3 = Double.parseDouble(antepenultimo);
		
		double soma = numero1 + numero2 + numero3;
		
		System.out.println("A soma do seu salario e: R$" + soma);
		System.out.println("A media do seu salario e: R$" + soma / 3);
		
		teclado.close();
	}

}
