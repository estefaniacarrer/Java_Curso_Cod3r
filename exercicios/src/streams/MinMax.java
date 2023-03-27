package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	
	public static void main(String[] args) {
		
		Aluno2 a1 = new Aluno2("Ana", 7.1);
		Aluno2 a2 = new Aluno2("Luna", 6.1);
		Aluno2 a3 = new Aluno2("Gui", 8.1);
		Aluno2 a4 = new Aluno2("Gabi", 10);

		List<Aluno2> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno2>melhoNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		Comparator<Aluno2>piorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return -1;
			if(aluno1.nota < aluno2.nota) return 1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhoNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
		
		System.out.println(alunos.stream().min(melhoNota).get());
		System.out.println(alunos.stream().max(piorNota).get());
	}
                 // tem como objetivo comparar objetos
}
