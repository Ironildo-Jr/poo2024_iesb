package br.edu.iesb.poo2024.devlab1;

import java.sql.Date;

public class Professor extends Pessoa{
    private int id;
    protected String cargo;
    protected String departamento;
    protected Date dtContratacao;
    protected boolean isOrientador;

    public Professor(){
        super();
    }

    public Professor(int id, String cargo, String departamento, Date dtContratacao, boolean isOrientador) {
        this.id = id;
        this.cargo = cargo;
        this.departamento = departamento;
        this.dtContratacao = dtContratacao;
        this.isOrientador = isOrientador;
    }
    
    public Professor(int idProfessor, String nome, String cpf, Date dataNascimento, int idPessoa, String cargo, String departamento,
            Date dtContratacao, boolean isOrientador) {
        super(idPessoa, nome, cpf, dataNascimento);
        this.id = idProfessor;
        this.cargo = cargo;
        this.departamento = departamento;
        this.dtContratacao = dtContratacao;
        this.isOrientador = isOrientador;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public Date getDataContratacao() {
        return dtContratacao;
    }
    public void setDatatContratacao(Date dtContratacao) {
        this.dtContratacao = dtContratacao;
    }
    public boolean isOrientador() {
        return isOrientador;
    }
    public void setOrientador(boolean isOrientador) {
        this.isOrientador = isOrientador;
    }
}
