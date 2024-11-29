package br.edu.iesb.poo2024.atividadeAvaliativa.model.entities;

import java.util.List;

public class CompraEntity {
    private List<ProdutoEntity> produtos;
    private String cpfComprador;
    private String formaPagamento;
    private double total;

    public List<ProdutoEntity> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<ProdutoEntity> produtos) {
        this.produtos = produtos;
    }
    public String getCpfComprador() {
        return cpfComprador;
    }
    public void setCpfComprador(String cpfComprador) {
        this.cpfComprador = cpfComprador;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
}
