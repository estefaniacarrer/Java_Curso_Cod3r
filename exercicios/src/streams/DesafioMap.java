package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		/*
		 * 1 .Numero para string binária-- 6 = "110" 
		 * 2. Inverter a string ... "110" = "011" 
		 * 3. Converter de volta para inteiro = "011" = 3
		 * utilizar Integer
		 */

		//Function<Integer, String> conversaoN = s -> Integer.toBinaryString(s); // feito direto
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> conversaoS = s -> Integer.parseInt(s, 2);

		System.out.println("Usando composição....");
		nums.stream()
		//.map(conversaoN)
		.map(Integer::toBinaryString)  // mesma ação da linha acima, porém feito com um comando direto
		.map(inverter)
		.map(conversaoS)
		.forEach(System.out::println);
	}
}
