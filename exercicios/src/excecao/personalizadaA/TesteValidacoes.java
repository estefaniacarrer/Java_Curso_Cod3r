package excecao.personalizadaA;

import excecao.Aluno2;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno2 aluno = new Aluno2("Ana",7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {  // posso tratar o erro junto : (StringVaziaException | NumeroForaIntervaloException e)
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	// o erro existente aparece com o mensagem criada nas classes de erros

}
