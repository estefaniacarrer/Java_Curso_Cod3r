package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
			Aluno2 a1 = new Aluno2("Ana", 7.1);
			Aluno2 a2 = new Aluno2("Lun", 7.1);
			Aluno2 a3 = new Aluno2("Gui", 8.1);
			Aluno2 a4 = new Aluno2("Gabi", 10);

			List<Aluno2> alunos = Arrays.asList(a1, a2, a3, a4);

			Predicate<Aluno2> aprovado = a -> a.nota >= 7;
			Predicate<Aluno2> reprovado = aprovado.negate();
			
			System.out.println(alunos.stream().allMatch(aprovado));  // todos aprovados?
			System.out.println(alunos.stream().anyMatch(aprovado));   // alguem foi aprovado
			System.out.println(alunos.stream().noneMatch(aprovado)); // nenhum foi aprovado
			System.out.println(alunos.stream().noneMatch(reprovado));  //reverse da opção anterior
	}

}
