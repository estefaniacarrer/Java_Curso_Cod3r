package lambdas;

@FunctionalInterface   // significa que vc não vai conseguir criar um segundo metodo, dando conflito por ex. na definição de lambdas
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}

} // interface funcional possui apenas um unico metodo abstrato ou default ou metodo estatico
