package br.edu.iesb.poo2024.atividadeAvaliativa;

import java.time.LocalDateTime;
import java.util.List;

public class Cliente extends ObjetoBase{
    private String nome;
    private String cpf;
    private LocalDateTime dataNascimento;
    private static List<Cliente> clientes;

    public Cliente(String nome, String cpf, LocalDateTime dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        super.setId(Util.gerarId(clientes));
        clientes.add(this);
    }

    public static Cliente getCliente(String cpf){
        for (Cliente c : clientes){
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }
}
