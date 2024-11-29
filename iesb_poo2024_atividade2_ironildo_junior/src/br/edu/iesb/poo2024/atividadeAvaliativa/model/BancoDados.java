package br.edu.iesb.poo2024.atividadeAvaliativa.model;

import java.util.ArrayList;
import java.util.List;

import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ClienteEntity;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ProdutoEntity;

public class BancoDados {
    static private List<ClienteEntity> clientes;
    static private List<ProdutoEntity> produtos;

    public BancoDados(){
        if(clientes == null){
            clientes = new ArrayList<>();
        }
        if (produtos == null) {
            produtos = new ArrayList<>();
        }
    }

    public List<ClienteEntity> getClientes(){
        return clientes;
    }

    public List<ProdutoEntity> getProdutos(){
        return produtos;
    }
}
