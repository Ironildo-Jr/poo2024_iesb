package br.edu.iesb.poo2024.atividadeAvaliativa.controllers.services;

import br.edu.iesb.poo2024.atividadeAvaliativa.model.dao.CarrinhoDAO;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.dao.ClienteDAO;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.CarrinhoEntity;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ClienteEntity;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.CompraEntity;

public class ClienteService {
    private ClienteDAO clienteDAO;
    private CarrinhoDAO carrinhoDAO;

    public ClienteService() {
        clienteDAO = new ClienteDAO();
        carrinhoDAO = new CarrinhoDAO();
    }

    public int cadastrarCliente(String nome, String cpf) {
        ClienteEntity clienteNovo = new ClienteEntity();
        clienteNovo.setCpf(cpf);
        clienteNovo.setNome(nome);
        return clienteDAO.cadastrarCliente(clienteNovo);
    }

    public int alterarCliente(String nome){
        ClienteEntity clienteNovo = new ClienteEntity();
        clienteNovo.setNome(nome);

        return clienteDAO.alterarCliente(clienteNovo);
    }

    public void excluirCliente(String cpf){
        clienteDAO.excluirCliente(cpf);
    }

    public ClienteEntity consultarCliente(String cpf){
        return clienteDAO.consultarCliente(cpf);
    }

    public int comprarCarrinho(String cpf, String formaPagamento){
        CompraEntity compra = new CompraEntity();
        CarrinhoEntity carrinho = carrinhoDAO.getCarrinhoCliente(cpf);

        if(carrinho.getProdutos().isEmpty()){
            // TODO lanca excecao
        }

        compra.setCpfComprador(cpf);
        compra.setFormaPagamento(formaPagamento);
        compra.setProdutos(carrinho.getProdutos());
        compra.setTotal(carrinho.getTotal());

        return 0;
    }
}
