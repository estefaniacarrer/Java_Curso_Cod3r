package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		//Trabalho na ter�a (V ou F)
		//Trabalho na quinta (V ou F)
		
		// 1 trabalho certo - 1 tv 32 p e familia sorvete
		// 2 trabalhos certos - 1 tv 50 p e familia sorvete
		// nenhum der certo - n�o vai sair - mais saudavel
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Un�rio!
		boolean maisSaudavel = !comprouSorvete; 
		
		System.out.println("Comprou TV 50\"?" + comprouTV50);
		System.out.println("Comprou TV 32\"?" + comprouTV32);
		System.out.println("Comprou Sorvete?" + comprouSorvete);
		System.out.println("Mais saudavel?" + maisSaudavel);
		
		
	}

}
