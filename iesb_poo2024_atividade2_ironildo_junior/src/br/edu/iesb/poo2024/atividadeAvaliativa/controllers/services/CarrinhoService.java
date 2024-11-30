package br.edu.iesb.poo2024.atividadeAvaliativa.controllers.services;

import br.edu.iesb.poo2024.atividadeAvaliativa.controllers.exceptions.ClienteException;
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
        try {
            ProdutoEntity produto = produtoDAO.consultarProduto(idProduto);

            carrinhoDAO.adicionarProduto(produto, cpf);
        } catch (Exception e) {
            System.err.println("Não foi possivel add o produto ao carrinho");
            e.printStackTrace();
        }

    }

    public void removeDoCarrinho(int idProduto, String cpf) {
        try {
            carrinhoDAO.removerProduto(idProduto, cpf);
        } catch (Exception e) {
            System.err.println("Não foi possivel remover o produto ao carrinho");
            e.printStackTrace();
        }
    }

    public CarrinhoEntity buscarCarrinho(String cpf) {
        try {
            return carrinhoDAO.getCarrinhoCliente(cpf);
        } catch (ClienteException e) {
            e.printStackTrace();
        }
        return null;
    }
}
