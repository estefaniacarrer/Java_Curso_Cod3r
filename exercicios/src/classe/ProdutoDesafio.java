package classe;

public class ProdutoDesafio {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
    ProdutoDesafio() {  // "void Produto () {} -> passa a ser um método	
	}
	
	ProdutoDesafio(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) { // nomes iguais + com parametros diferentes
		return preco * (1 - desconto + descontoDoGerente);
	}
	
	

}
