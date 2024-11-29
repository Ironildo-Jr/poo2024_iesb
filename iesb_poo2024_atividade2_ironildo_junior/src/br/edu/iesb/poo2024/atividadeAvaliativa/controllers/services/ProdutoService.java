package br.edu.iesb.poo2024.atividadeAvaliativa.controllers.services;

import br.edu.iesb.poo2024.atividadeAvaliativa.model.dao.ProdutoDAO;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ProdutoEntity;

public class ProdutoService {
    private ProdutoDAO produtoDAO;

    public ProdutoService() {
        produtoDAO = new ProdutoDAO();
    }

    public int cadastrarProduto(String nome, String descricao, double preco, int qtd) {
        ProdutoEntity produtoNovo = new ProdutoEntity();
        produtoNovo.setNome(nome);
        produtoNovo.setDescricao(descricao);
        produtoNovo.setPreco(preco);
        produtoNovo.setQuantidade(qtd);
        return produtoDAO.cadastrarProduto(produtoNovo);
    }

    public int alterarProduto(String nome, String descricao, double preco, int qtd){
        ProdutoEntity produtoNovo = new ProdutoEntity();
        produtoNovo.setNome(nome);
        produtoNovo.setDescricao(descricao);
        produtoNovo.setPreco(preco);
        produtoNovo.setQuantidade(qtd);

        return produtoDAO.alterarProduto(produtoNovo);
    }

    public void excluirProduto(int id){
        produtoDAO.excluirProduto(id);
    }

    public ProdutoEntity consultarProduto(int id){
        return produtoDAO.consultarProduto(id);
    }
}
