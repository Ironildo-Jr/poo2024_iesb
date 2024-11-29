package br.edu.iesb.poo2024.atividadeAvaliativa.model.dao;

import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.CarrinhoEntity;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ClienteEntity;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ProdutoEntity;

public class CarrinhoDAO {
    private ClienteDAO clienteDAO;

    public CarrinhoDAO() {
        clienteDAO = new ClienteDAO();
    }

    public void adicionarProduto(ProdutoEntity produto, String cpf) {
        CarrinhoEntity carrinhoCliente = getCarrinhoCliente(cpf);
        carrinhoCliente.getProdutos().add(produto);
        double valorNovo = carrinhoCliente.getTotal() + produto.getPreco();
        carrinhoCliente.setTotal(valorNovo);
    }

    public void removerProduto(int idProduto, String cpf){
        CarrinhoEntity carrinhoCliente = getCarrinhoCliente(cpf);
        boolean removeu = carrinhoCliente.getProdutos().removeIf(x-> x.getId() == idProduto);
        if (!removeu){
            // TODO lanca excecao
        }
    }

    public CarrinhoEntity getCarrinhoCliente(String cpf){
        ClienteEntity cliente = clienteDAO.consultarCliente(cpf);

        return cliente.getCarrinho();
    }
}
