package br.edu.iesb.poo2024.atividadeAvaliativa.model.dao;

import br.edu.iesb.poo2024.atividadeAvaliativa.controllers.exceptions.ProdutoException;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.BancoDados;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ProdutoEntity;

public class ProdutoDAO {
    private BancoDados bd;

    public ProdutoDAO() {
        bd = new BancoDados();
    }

    public int cadastrarProduto(ProdutoEntity produto) throws ProdutoException {

        if (existe(produto.getId())) {
            throw new ProdutoException("Produto ja existe na base de dados");
        }

        produto.setId(gerarId());

        bd.getProdutos().add(produto);

        return produto.getId();
    }

    public int alterarProduto(ProdutoEntity produto) throws ProdutoException {

        ProdutoEntity produtoAntigo = consultarProduto(produto.getId());

        produtoAntigo.setNome(produto.getNome());

        return produtoAntigo.getId();
    }

    public void excluirProduto(int id) throws ProdutoException {
        boolean removeu = bd.getClientes().removeIf(x -> x.getId() == id);
        if (!removeu) {
            throw new ProdutoException("Produto nao encontrado");
        }
    }

    public ProdutoEntity consultarProduto(int id) throws ProdutoException {
        return bd.getProdutos().stream().filter(x -> x.getId() == id).findFirst()
                .orElseThrow(() -> new ProdutoException("Produto nao encontrado"));
    }

    private int gerarId() {
        return bd.getProdutos().stream().map(ProdutoEntity::getId).max(Integer::compare).orElse(0) + 1;
    }

    private boolean existe(int id) {
        return bd.getProdutos().stream().filter(x -> x.getId() == id).findFirst().isPresent();
    }
}
