package br.edu.iesb.poo2024.devlab1;

import java.util.Date;

public class Pessoa {
    private int id;
    protected String nome;
    protected String cpf;
    protected Date dtNascimento;

    public Pessoa() {}

    public Pessoa(int id, String nome, String cpf, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dataNascimento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setDataNascimento(Date data){
        dtNascimento = data;
    }

    public Date getDataNascimento(){
        return dtNascimento;
    }

    public String toString(){
        return "Id: "+ id +"\nNome: " + nome + "\nCpf: " + cpf + "\nData de Nascimento: " + dtNascimento.toString();
    }
}
