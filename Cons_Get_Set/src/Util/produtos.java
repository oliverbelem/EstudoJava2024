package Util;

public class produtos {
    private String nome;
    private double preco;
    private int quantidade;

    //Declaração de construtor.
    public produtos (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Sobrecarga do contrutor
    public produtos (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public void adicaoProdutos(int quantidade) {
        this.quantidade += quantidade; //aqui é especificado(pelo this) que o que deve ser acessadoé o atributo da classe.
    }

    public void remocaoProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", R$"
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades. Valor total: R$"
                + String.format("%.2f", valorTotalEstoque());
    }
}
