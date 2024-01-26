package entities;

public class produtos {
	
	public String nome;
	public double preco;
	public int quantidade;
	

	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	
	public void adicaoProdutos(int quantidade) {
		this.quantidade += quantidade; //aqui é especificado(pelo this) que o que deve ser acessadoé o atributo da classe.
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + ", R$" + String.format("%.2f", preco) + ", " + quantidade + "unidades. Valor total: " + String.format("%.2f", valorTotalEstoque()); 
	}
}