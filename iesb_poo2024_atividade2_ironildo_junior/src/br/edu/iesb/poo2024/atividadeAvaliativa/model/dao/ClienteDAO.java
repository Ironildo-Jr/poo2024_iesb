package br.edu.iesb.poo2024.atividadeAvaliativa.model.dao;

import java.util.List;

import br.edu.iesb.poo2024.atividadeAvaliativa.controllers.exceptions.ClienteException;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.BancoDados;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ClienteEntity;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.CompraEntity;

public class ClienteDAO {
    private BancoDados bd;
    public ClienteDAO() {
        bd = new BancoDados();
    }

    public int cadastrarCliente(ClienteEntity cliente) throws ClienteException {
        if (existe(cliente.getCpf())) {
            throw new ClienteException("Cliente ja existe na base de dados");
        }

        cliente.setId(gerarId());
        bd.getClientes().add(cliente);

        return cliente.getId();
    }

    public int alterarCliente(ClienteEntity cliente) throws ClienteException {

        ClienteEntity clienteAntigo = consultarCliente(cliente.getCpf());

        clienteAntigo.setNome(cliente.getNome());

        return clienteAntigo.getId();
    }

    public void excluirCliente(String cpf) throws ClienteException {

        boolean removeu = bd.getClientes().removeIf(x -> x.getCpf().equals(cpf));

        if (removeu) {
            throw new ClienteException("Cliente nao existe na base de dados");
        }
    }

    public ClienteEntity consultarCliente(String cpf) throws ClienteException {
        return bd.getClientes().stream().filter(x -> x.getCpf().equals(cpf)).findFirst()
                .orElseThrow(() -> new ClienteException("Cliente nao encontrado"));
    }

    public int adicionarCompra(CompraEntity compra) throws ClienteException {
        ClienteEntity cliente = consultarCliente(compra.getCpfComprador());

        compra.getProdutos().stream().forEach(x -> x.setPreco(x.getQuantidade() - 1));

        List<CompraEntity> compras = cliente.getCompras();
        compras.add(compra);

        return cliente.getId();
    }

    public List<CompraEntity> buscarCompras(String cpf) throws ClienteException{
        return consultarCliente(cpf).getCompras();
    }

    private int gerarId() {
        return bd.getClientes().stream().map(ClienteEntity::getId).max(Integer::compare).orElse(1);
    }

    private boolean existe(String cpf) {
        return bd.getClientes().stream().anyMatch(x -> x.getCpf().equals(cpf));
    }
}
