package br.edu.iesb.poo2024.atividadeAvaliativa.model.entities;

import java.util.ArrayList;
import java.util.List;

public class ClienteEntity {
    private int id;
    private String nome;
    private String cpf;
    private CarrinhoEntity carrinho;
    private List<CompraEntity> compras;

    public ClienteEntity(){
        compras = new ArrayList<>();
        carrinho = new CarrinhoEntity();
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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public CarrinhoEntity getCarrinho() {
        return carrinho;
    }
    public List<CompraEntity> getCompras() {
        return compras;
    }
}
