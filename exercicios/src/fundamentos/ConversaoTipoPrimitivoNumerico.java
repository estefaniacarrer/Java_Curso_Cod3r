package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1;  // tipo inteiro para o double - conversão implícita
		System.out.println(a);
		
		float b = (float)1.123456788888; // ou simplismente colocar um F na frente
		System.out.println(b);  // conversão explícita (CAST)
		
		int c = 130;  // 127 maior valor para byte
		byte d = (byte) c; // conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1.999999;  //vai mostrar o valor inteiro e perder o valor quebrado
		int f = (int) e;      // conversão explícita (CAST
		System.out.println(f);
		
	}

}
