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
		return String.format(formato, this.dia, mes, ano); // op��o mais flexivel
	}
	
	void imprimirDataFormatada() { // this aqui -> acessar um metodo que pertence a instancia.
		System.out.println(this.obterDataFormatada());// void -> ausencia de retorno, n�o precisa ser uma string , int, etc....
	}                      // exemplo: posso colocar o metodo j� definido "obterDataFormatada". Esse tipo de metodo n�o funcionara em aplica��o desktop, web, mobile... etc, ent�o melhor utilizar a primeira op��o.

}

// parametros, variaveis e constantes s�o visiveis apenas dentro dos m�todos.
