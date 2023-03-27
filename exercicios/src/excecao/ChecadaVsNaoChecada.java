package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
		
	}
    
	// Exce��o n�o checada ou n�o verificada
	static void geraErro1() {  // n�o tem a necessidade de por o throws ....
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	
	// Exce��o checada ou verificada
	static void geraErro2() throws Exception{  // throws Exception antes do colchete  ou usar o try...catch
			throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
