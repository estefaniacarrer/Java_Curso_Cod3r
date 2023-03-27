package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
    Produto() {  // "void Produto () {} -> passa a ser um método	
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) { // nomes iguais + com parametros diferentes
		return preco * (1 - desconto + descontoDoGerente);
	}
	
	

}
