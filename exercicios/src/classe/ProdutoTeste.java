package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Notebook", 4356.89, 0.25);
		//p1.nome = "Notebook"; -> declarado direto por conta do construtor inserido com parametros
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto( );
		p2.nome = "Caneta Preta"; // para permanecer desta forma é necessário ter um construtor padrão vazio.
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2)/ 2;
		
		System.out.printf("Média do carrinho será: R$ %.2f.", mediaCarrinho);
	}

}
