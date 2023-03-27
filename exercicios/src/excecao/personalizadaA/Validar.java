package excecao.personalizadaA;

import excecao.Aluno2;

public class Validar {
	
	private Validar() {}
	
	public static void aluno (Aluno2 aluno) {
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {  // trim -> tirar os espaços vazios / empty(vazio) 
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}

}
