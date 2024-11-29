package br.edu.iesb.poo2024.atividadeAvaliativa.model.entities;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoEntity {
    private List<ProdutoEntity> produtos;
    private double total;

    public CarrinhoEntity(){
        produtos = new ArrayList<>();
    }

    public List<ProdutoEntity> getProdutos() {
        return produtos;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    
}
