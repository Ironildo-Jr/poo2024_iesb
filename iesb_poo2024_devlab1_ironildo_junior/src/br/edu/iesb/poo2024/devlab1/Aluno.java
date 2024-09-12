package br.edu.iesb.poo2024.devlab1;

import java.util.Date;

public class Aluno extends Pessoa{
    private int id;
    protected int numeroMatricula;
    protected String nomeCurso;
    protected int numeroSemestre;
    protected Date dataMatricula;

    public Aluno(){
        super();
    }

    public Aluno(int idAluno, String nome, String cpf, Date dataNascimento, int idPessoa, int numeroMatricula,
            String nomeCurso, int numeroSemestre, Date dataMatricula) {
        super(idPessoa, nome, cpf, dataNascimento);
        this.id = idAluno;
        this.numeroMatricula = numeroMatricula;
        this.nomeCurso = nomeCurso;
        this.numeroSemestre = numeroSemestre;
        this.dataMatricula = dataMatricula;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumeroMatricula() {
        return numeroMatricula;
    }
    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public int getNumeroSemestre() {
        return numeroSemestre;
    }
    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }
    public Date getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    
}
