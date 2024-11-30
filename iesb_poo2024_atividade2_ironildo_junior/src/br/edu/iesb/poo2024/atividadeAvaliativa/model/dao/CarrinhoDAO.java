package br.edu.iesb.poo2024.atividadeAvaliativa.model.dao;

import br.edu.iesb.poo2024.atividadeAvaliativa.controllers.exceptions.ClienteException;
import br.edu.iesb.poo2024.atividadeAvaliativa.controllers.exceptions.ProdutoException;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.CarrinhoEntity;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ClienteEntity;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ProdutoEntity;

public class CarrinhoDAO {
    private ClienteDAO clienteDAO;

    public CarrinhoDAO() {
        clienteDAO = new ClienteDAO();
    }

    public void adicionarProduto(ProdutoEntity produto, String cpf) throws ClienteException {
        CarrinhoEntity carrinhoCliente = getCarrinhoCliente(cpf);
        carrinhoCliente.getProdutos().add(produto);
        double valorNovo = carrinhoCliente.getTotal() + produto.getPreco();
        carrinhoCliente.setTotal(valorNovo);
    }

    public void removerProduto(int idProduto, String cpf) throws ProdutoException, ClienteException {
        CarrinhoEntity carrinhoCliente = getCarrinhoCliente(cpf);
        boolean removeu = carrinhoCliente.getProdutos().removeIf(x -> x.getId() == idProduto);
        if (!removeu) {
            throw new ProdutoException("Nao produto nao achado no carrinho");
        }
    }

    public CarrinhoEntity getCarrinhoCliente(String cpf) throws ClienteException {
        ClienteEntity cliente = clienteDAO.consultarCliente(cpf);

        return cliente.getCarrinho();
    }
}
