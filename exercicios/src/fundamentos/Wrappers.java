package fundamentos;

public class Wrappers {  // os tipos primitivos orientada a objeto

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;

//		Integer.parseInt(teclado.next()); - usado com o scanner
		Integer i = 10000; // int - tipo primitivo - Integer - classe
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c + "...");

	}

}
