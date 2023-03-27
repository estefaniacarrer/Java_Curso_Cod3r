package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String>aprovados = Arrays
				.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional....");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome2-> { System.out.println(nome2 + "!!!");});
		
		System.out.println("\nMethod Reference #01..."); // referenciar um metodo
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(nome3-> meuImprimir(nome3));
		
		System.out.println("\nMethod Reference #02..."); 
		aprovados.forEach(Foreach::meuImprimir);
		
	}
	
	static void meuImprimir(String nome3) {
		System.out.println("Oi! Meu nome é " + nome3);
	}

}
