package classe;

public class ProdutoTesteDesafio {
	
	public static void main(String[] args) {
		
		
		ProdutoDesafio p1 = new ProdutoDesafio("Notebook", 4356.89);
		//p1.nome = "Notebook"; -> declarado direto por conta do construtor inserido com parametros
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new ProdutoDesafio( );
		p2.nome = "Caneta Preta"; // para permanecer desta forma é necessário ter um construtor padrão vazio.
		p2.preco = 12.56;

		ProdutoDesafio.desconto = 0.5;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2)/ 2;
		
		System.out.printf("Média do carrinho será: R$ %.2f.", mediaCarrinho);
	}

}
