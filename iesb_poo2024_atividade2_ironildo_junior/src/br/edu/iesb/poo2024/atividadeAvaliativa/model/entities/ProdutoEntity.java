package br.edu.iesb.poo2024.atividadeAvaliativa.model.entities;

public class ProdutoEntity {
    private int id;
    private String nome;
    private String descricao;
    private int quantidade;
    private double preco;

    public ProdutoEntity(){}

    public ProdutoEntity(String nome, String descricao, int quantidade, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ProdutoEntity [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", quantidade=" + quantidade
                + ", preco=" + preco + "]";
    }
}
