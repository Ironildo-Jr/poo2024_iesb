package br.edu.iesb.poo2024.atividadeAvaliativa.controllers.services;

import java.util.List;

import br.edu.iesb.poo2024.atividadeAvaliativa.controllers.exceptions.ClienteException;
import br.edu.iesb.poo2024.atividadeAvaliativa.controllers.exceptions.CompraException;
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
        try {
            return clienteDAO.cadastrarCliente(clienteNovo);
        } catch (ClienteException e) {
            System.err.println("Não foi possivel cadastrar o cliente");
            e.printStackTrace();
        }
        return 0;
    }

    public int alterarCliente(String nome){
        ClienteEntity clienteNovo = new ClienteEntity();
        clienteNovo.setNome(nome);

        try {
            return clienteDAO.alterarCliente(clienteNovo);
        } catch (ClienteException e) {
            System.err.println("Não foi possivel alterar o cliente");
            e.printStackTrace();
        }
        return 0;
    }

    public void excluirCliente(String cpf){
        try {
            clienteDAO.excluirCliente(cpf);
        } catch (ClienteException e) {
            System.err.println("Não foi possivel excluir o cliente");
            e.printStackTrace();
        }
    }

    public ClienteEntity consultarCliente(String cpf){
        try {
            return clienteDAO.consultarCliente(cpf);
        } catch (ClienteException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int comprarCarrinho(String cpf, String formaPagamento) throws CompraException{
        CompraEntity compra = new CompraEntity();
        CarrinhoEntity carrinho = null;
        try {
            carrinho = carrinhoDAO.getCarrinhoCliente(cpf);
        } catch (ClienteException e) {
            System.err.println("Não foi concluir a compra");
            e.printStackTrace();
        }

        if(carrinho.getProdutos().isEmpty()){
           throw new CompraException("Carrinho vazio");
        }

        compra.setCpfComprador(cpf);
        compra.setFormaPagamento(formaPagamento);
        compra.setProdutos(carrinho.getProdutos());
        compra.setTotal(carrinho.getTotal());

        return 0;
    }

    public List<CompraEntity> historicoCompras(String cpf){
        try {
            return clienteDAO.buscarCompras(cpf);
        } catch (ClienteException e) {
            e.printStackTrace();
        }
        return null;
    }
}
