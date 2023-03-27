package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a,3);S
//		
//		System.out.println(b);
//		System.out.println(c);
		
		int n = 6 * (3 + 2);
		int n1 = (int)Math.pow(n, 2)/ (3*2);
		
		System.out.println(n1);
		
		int m = ((1-5)*(2-7))/2;
		int m1 = (int)Math.pow(m, 2);
		
		System.out.println(m1);
		
		int p = (n1 - m1)/10;
		int p1 = (int)Math.pow(p, 3);

		
		System.out.println(p1);
	}

}
