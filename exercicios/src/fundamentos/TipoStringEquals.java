package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		
		System.out.println("2".equals(s1));
		
		Scanner teclado = new Scanner (System.in);
		
		String s2 = teclado.nextLine(); //(Apesar de utilizar o trim o "next" retira os espaços em branco, "nextLine" não retira.
		System.out.println("2" == s2.trim()); // trim serve para retirar os espaços em branco caso ocorra na digitalização no console
		
		System.out.println("2".equals(s2.trim())); // equals para comparar o conteúdo interno.
		
		teclado.close();
		
	}

}
