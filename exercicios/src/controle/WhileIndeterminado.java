package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = ""; // aqui n�o pode conter o valor, pois se tivesse n�o entraria no console por se a condi��o.
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Voc� diz: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}

}
