package oo.composicao;

public class Item {

	String nome;
	int quantidade;
	double preco;
	Compra compra;

	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		
		
	}
  // teste
	public String toString() {
		return "Item " + nome + " - Valor total: " +  (quantidade * preco);
	}

}
