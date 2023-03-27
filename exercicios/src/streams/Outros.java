package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	
	public static void main(String[] args) {
		
		Aluno2 a1 = new Aluno2("Ana", 7.1);
		Aluno2 a2 = new Aluno2("Luna", 6.1);
		Aluno2 a3 = new Aluno2("Gui", 8.1);
		Aluno2 a4 = new Aluno2("Gabi", 10);
		Aluno2 a5 = new Aluno2("Ana", 7.1);
		Aluno2 a6 = new Aluno2("Pedro", 8.1);
		Aluno2 a7 = new Aluno2("Gui", 8.1);
		Aluno2 a8 = new Aluno2("Maria", 10);

		List<Aluno2> alunos = 
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
              .distinct()
              .skip(2)
              .limit(2)
              .forEach(System.out::println);
		
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
              .distinct()
              .skip(2)
              .takeWhile(a ->a.nota >= 7)   // verificar a partir do 2 quem passou
              .forEach(System.out::println);
              
   }  // necessario equals and hashcode pra funcionar
}
