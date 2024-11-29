package br.edu.iesb.poo2024.atividadeAvaliativa.model.dao;

import java.util.stream.Stream;

import br.edu.iesb.poo2024.atividadeAvaliativa.model.BancoDados;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ProdutoEntity;

public class ProdutoDAO {
    private BancoDados bd;
    private Stream<ProdutoEntity> produtoBd;

    public ProdutoDAO() {
        bd = new BancoDados();
        produtoBd = bd.getProdutos().stream();
    }

    public int cadastrarProduto(ProdutoEntity produto) {

        if (existe(produto.getId())){
            // TODO lanca excecao
        }

        produto.setId(gerarId());

        bd.getProdutos().add(produto);

        return produto.getId();
    }

    public int alterarProduto(ProdutoEntity produto){

        ProdutoEntity produtoAntigo = consultarProduto(produto.getId());

        produtoAntigo.setNome(produto.getNome());

        return produtoAntigo.getId();
    }

    public void excluirProduto(int id){
        boolean removeu = bd.getClientes().removeIf(x -> x.getId() == id);
        if (!removeu) {
            // TODO lanca excecao
        }
    }

    public ProdutoEntity consultarProduto(int id){
        return produtoBd.filter(x -> x.getId() == id).findFirst().orElseThrow(null);
    }

    private int gerarId() {
        return produtoBd.map(ProdutoEntity::getId).max(Integer::compare).get();
    }

    private boolean existe(int id) {
        return produtoBd.anyMatch(x -> x.getId() == id);
    }
}
