package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
//		d1.dia = 10;
//		d1.mes = 04;
		d1.ano = 1999;
		
		var d2 = new Data(15, 3, 1993);
//		d2.dia = 15;
//		d2.mes = 03;  -> não tendo valores aqui ele seguira os valores do Constr. padrão
//		d2.ano = 1993;
		
			
		String dataFormatada1 = d1.obterDataFormatada(); // apenas um exemplo
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada(); // já aparece automatico
		d2.imprimirDataFormatada();
	}

}
