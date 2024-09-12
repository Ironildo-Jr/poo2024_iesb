package br.edu.iesb.poo2024.devlab1;

import java.util.Date;

public class Coordenador extends Pessoa{
    private int id;
    protected String departamento;
    protected Date dataContratacao;

    public Coordenador() {
        super();
    }

    public Coordenador(int idCoordenador, String nome, String cpf, Date dataNascimento, int idPessoa, String departamento,
            Date dataContratacao) {
        super(idPessoa, nome, cpf, dataNascimento);
        this.id = idCoordenador;
        this.departamento = departamento;
        this.dataContratacao = dataContratacao;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public Date getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    
}
