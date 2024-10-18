package br.edu.iesb.poo2024.atividadeAvaliativa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends ObjetoBase {
    private String nome;
    private String cargo;
    private static List<Funcionario> funcionarios = new ArrayList<>();

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;

        super.setId(Util.gerarId(funcionarios));
        funcionarios.add(this);
    }

    public Ingresso venderIngresso(String cpfCliente, int idSessao, String tipoIngresso, double valorPago) {

        try {
            Cliente cliente = Cliente.getCliente(cpfCliente);
            Sessao sessao = Sessao.getSessao(idSessao);
            if (cliente == null || sessao == null) {
                throw new CinemaExcecoes(EnumExcecoes.INGRESSO_CLIENTE);
            }

            if (sessao.getQtdIngressosVendidos() >= sessao.getQtdMaximoIngressos()) {
                throw new CinemaExcecoes(EnumExcecoes.SESSAO_CHEIA);
            }

            if ((LocalDateTime.now().getYear() - cliente.getDataNascimento().getYear()) <= sessao.getFilme()
                    .getClassificacaoEtaria()) {
                throw new CinemaExcecoes(EnumExcecoes.MENOR_IDADE);
            }

            sessao.addIngressoVendido();

            return new Ingresso(tipoIngresso, cliente, valorPago, sessao);
        } catch (CinemaExcecoes e) {
            System.out.println("Nao foi possivel criar o ingresso");
            e.printStackTrace();
        }

        return null;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
}
