package lambdas;

@FunctionalInterface   // significa que vc n�o vai conseguir criar um segundo metodo, dando conflito por ex. na defini��o de lambdas
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}

} // interface funcional possui apenas um unico metodo abstrato ou default ou metodo estatico
