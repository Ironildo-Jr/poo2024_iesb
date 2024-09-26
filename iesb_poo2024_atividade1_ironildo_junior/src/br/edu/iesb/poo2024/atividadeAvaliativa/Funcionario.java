package br.edu.iesb.poo2024.atividadeAvaliativa;

import java.time.LocalDateTime;
import java.util.List;

public class Funcionario extends ObjetoBase{
    private String nome;
    private String cargo;
    private static List<Funcionario> funcionarios;

    public Funcionario(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;

        super.setId(Util.gerarId(funcionarios));
        funcionarios.add(this);
    }
    public Ingresso venderIngresso(String cpfCliente, int idSessao, String tipoIngresso, double valorPago){
        Cliente cliente = Cliente.getCliente(cpfCliente);
        if (cliente == null){
            throw new RuntimeException("Cliente nao foi achado na base");
        }

        Sessao sessao = Sessao.getSessao(idSessao);
        if (sessao == null){
            throw new RuntimeException("Sessao nao foi achada na base");
        }else if (sessao.getQtdMaximoIngressos() >= sessao.getQtdIngressosVendidos()){
            throw new RuntimeException("Sessao cheia");
        }

        if(LocalDateTime.now().getYear() - cliente.getDataNascimento().getYear() == sessao.getFilme().getClassificacaoEtaria()){
            throw new RuntimeException("CLiente nao pode ver o filme por causa da idade");
        }

        sessao.addIngressoVendido();

        return new Ingresso(tipoIngresso, cliente, valorPago, sessao);
    }
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
}
