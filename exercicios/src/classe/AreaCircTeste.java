package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		//a1.pi = 1000000; -> se tornou uma constante e nao permite mais alterações "final"
		
//		AreaCirc a2 = new AreaCirc(5);
//		a2.raio = 100; //-> esse valor prevalece
//		a2.pi = 0;
		
		// AreaCirc.PI = 3.1415;
		
		System.out.println(a1.area());
		
		
		System.out.println(AreaCirc.area(100)); // como foi criado o static double area ele já lê direto sem a necessidade e uma instancia como por ex do a2
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}

}
