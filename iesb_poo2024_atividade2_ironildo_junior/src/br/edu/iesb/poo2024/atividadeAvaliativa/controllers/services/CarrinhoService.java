package br.edu.iesb.poo2024.atividadeAvaliativa.controllers.services;

import br.edu.iesb.poo2024.atividadeAvaliativa.model.dao.CarrinhoDAO;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.dao.ProdutoDAO;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.CarrinhoEntity;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ProdutoEntity;

public class CarrinhoService {
    private CarrinhoDAO carrinhoDAO;
    private ProdutoDAO produtoDAO;

    public CarrinhoService() {
        carrinhoDAO = new CarrinhoDAO();
        produtoDAO = new ProdutoDAO();
    }

    public void addAoCarrinho(int idProduto, String cpf) {
        ProdutoEntity produto = produtoDAO.consultarProduto(idProduto);

        carrinhoDAO.adicionarProduto(produto, cpf);

    }

    public void removeDoCarrinho(int idProduto, String cpf) {
        carrinhoDAO.removerProduto(idProduto, cpf);
    }

    public CarrinhoEntity buscarCarrinho(String cpf) {
        return carrinhoDAO.getCarrinhoCliente(cpf);
    }
}
