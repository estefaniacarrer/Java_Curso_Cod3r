package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		
		System.out.println("2".equals(s1));
		
		Scanner teclado = new Scanner (System.in);
		
		String s2 = teclado.nextLine(); //(Apesar de utilizar o trim o "next" retira os espa�os em branco, "nextLine" n�o retira.
		System.out.println("2" == s2.trim()); // trim serve para retirar os espa�os em branco caso ocorra na digitaliza��o no console
		
		System.out.println("2".equals(s2.trim())); // equals para comparar o conte�do interno.
		
		teclado.close();
		
	}

}
