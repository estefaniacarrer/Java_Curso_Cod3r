package classe;

public class Data {
	
	int dia;
	int mes;
	int ano; 
	
	Data () {
//		dia = 01;
//		mes = 01;
//		ano = 1970;
		this(1, 1, 1970);
		
	}
	
	Data (int dia, int mes, int ano) {
	   this.dia = dia;
	   this.mes = mes;  // referenciar o objeto com mesmo nome.
	   this.ano = ano;
	}
	
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; // constante("final") local , pois esta dentro do metodo - fora ela pode ser usada em outros metodos
		return String.format(formato, this.dia, mes, ano); // opção mais flexivel
	}
	
	void imprimirDataFormatada() { // this aqui -> acessar um metodo que pertence a instancia.
		System.out.println(this.obterDataFormatada());// void -> ausencia de retorno, não precisa ser uma string , int, etc....
	}                      // exemplo: posso colocar o metodo já definido "obterDataFormatada". Esse tipo de metodo não funcionara em aplicação desktop, web, mobile... etc, então melhor utilizar a primeira opção.

}

// parametros, variaveis e constantes são visiveis apenas dentro dos métodos.
