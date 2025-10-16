package Tarefa06;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    private String id;
    private String descricao;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
        this.id = id;
        this.descricao = "";
    }

    public String getId() { return id; }
    public double getPreco() { return preco; }
    public String getNome() { return nome; }
    public void adicionarEstoque(int quantidade) { this.estoque += quantidade; }
}
