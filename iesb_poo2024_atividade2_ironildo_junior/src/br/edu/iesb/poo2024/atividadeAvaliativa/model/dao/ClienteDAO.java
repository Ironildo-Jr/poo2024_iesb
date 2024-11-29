package br.edu.iesb.poo2024.atividadeAvaliativa.model.dao;

import java.util.List;
import java.util.stream.Stream;

import br.edu.iesb.poo2024.atividadeAvaliativa.model.BancoDados;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.ClienteEntity;
import br.edu.iesb.poo2024.atividadeAvaliativa.model.entities.CompraEntity;

public class ClienteDAO {
    private BancoDados bd;
    private Stream<ClienteEntity> clientesBd;

    public ClienteDAO() {
        bd = new BancoDados();
        clientesBd = bd.getClientes().stream();
    }

    public int cadastrarCliente(ClienteEntity cliente) {
        if (existe(cliente.getCpf())) {
            // TODO lanca excecao
        }

        cliente.setId(gerarId());
        bd.getClientes().add(cliente);

        return cliente.getId();
    }

    public int alterarCliente(ClienteEntity cliente) {

        ClienteEntity clienteAntigo = consultarCliente(cliente.getCpf());

        clienteAntigo.setNome(cliente.getNome());

        return clienteAntigo.getId();
    }

    public void excluirCliente(String cpf) {

        boolean removeu = bd.getClientes().removeIf(x -> x.getCpf().equals(cpf));

        if (removeu) {
            // TODO lanca excecao
        }
    }

    public ClienteEntity consultarCliente(String cpf) {
        return clientesBd.filter(x -> x.getCpf().equals(cpf)).findFirst().orElseThrow(null);
    }

    public int adicionarCompra(CompraEntity compra) {
        ClienteEntity cliente = consultarCliente(compra.getCpfComprador());

        compra.getProdutos().stream().forEach(x -> x.setPreco(x.getQuantidade() - 1));

        List<CompraEntity> compras = cliente.getCompras();
        compras.add(compra);

        return cliente.getId();
    }

    private int gerarId() {
        return clientesBd.map(ClienteEntity::getId).max(Integer::compare).get();
    }

    private boolean existe(String cpf) {
        return clientesBd.anyMatch(x -> x.getCpf().equals(cpf));
    }
}
