package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 5.0;
		
//		String resultadoParcial = media >= 5.0 ? "Eem recuperacao" : "reprovado";
//		String resultado = media >= 7.0 ? "aprovado" : resultadoParcial;
		
//		String resultado = media >= 7.0 ? 
//				"aprovado" : media >= 5.0 ? "em recuperacao" : "reprovado"; ( um op. ternário dentro do outro)
		
		String resultadofinal = media >= 7.0 ? "aprovado." : "em recuperacao.";
		
		System.out.println("O aluno esta " + resultadofinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto? "Sim." : "Nao.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}

}
