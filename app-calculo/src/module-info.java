module app.calculo {
	
	requires transitive app.logging; 
	//|> aquilo que eu recebi de outro modulo, vai estar 
	//disponivel para o modulo "cliente por ex" que for acessar
	exports br.com.cod3r.app.calculo;
	
//	exports br.com.cod3r.app.calculo.interno
//	    to app.financeiro;  //possibilidade de exportar determinads
	//pacotes com todas as suas classes internas para um determinado modulo
	
	opens br.com.cod3r.app.calculo to app.financeiro;
	
	requires app.api;
	provides br.com.cod3r.app.Calculadora
	   with br.com.cod3r.app.calculo.CalculadoraImpl;
}
