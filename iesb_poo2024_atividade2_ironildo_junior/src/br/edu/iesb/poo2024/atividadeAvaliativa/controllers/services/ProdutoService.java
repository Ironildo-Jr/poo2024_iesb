package br.edu.iesb.poo2024.atividadeAvaliativa.controllers.services;

import br.edu.iesb.poo2024.atividadeAvaliativa.controllers.exceptions.ProdutoException;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.dao.ProdutoDAO;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ProdutoEntity;

public class ProdutoService {
    private ProdutoDAO produtoDAO;

    public ProdutoService() {
        produtoDAO = new ProdutoDAO();
    }

    public int cadastrarProduto(String nome, String descricao, double preco, int qtd) {
        ProdutoEntity produtoNovo = new ProdutoEntity();
        produtoNovo.setId(0);
        produtoNovo.setNome(nome);
        produtoNovo.setDescricao(descricao);
        produtoNovo.setPreco(preco);
        produtoNovo.setQuantidade(qtd);
        try {
            return produtoDAO.cadastrarProduto(produtoNovo);
        } catch (ProdutoException e) {
            System.err.println("Nao foi possivel cadastrar o produto");
            e.printStackTrace();
        }
        return 0;
    }

    public int alterarProduto(String nome, String descricao, double preco, int qtd){
        ProdutoEntity produtoNovo = new ProdutoEntity();
        produtoNovo.setNome(nome);
        produtoNovo.setDescricao(descricao);
        produtoNovo.setPreco(preco);
        produtoNovo.setQuantidade(qtd);

        try {
            return produtoDAO.alterarProduto(produtoNovo);
        } catch (ProdutoException e) {
            System.err.println("Nao foi possivel alterar o produto");
            e.printStackTrace();
        }
        return 0;
    }

    public void excluirProduto(int id){
        try {
            produtoDAO.excluirProduto(id);
        } catch (ProdutoException e) {
            System.err.println("Nao foi possivel excluir o produto");
            e.printStackTrace();
        }
    }

    public ProdutoEntity consultarProduto(int id){
        try {
            return produtoDAO.consultarProduto(id);
        } catch (ProdutoException e) {
            e.printStackTrace();
        }
        return null;
    }
}
