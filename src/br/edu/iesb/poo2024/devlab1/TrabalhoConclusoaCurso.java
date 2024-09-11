package br.edu.iesb.poo2024.devlab1;

import java.util.Date;

public class TrabalhoConclusoaCurso {
    private int id;
    private String titulo;
    private String objetivo;
    private Date dtInicio;
    private Date dtConclusao;
    private ProfessorOrientadorTcc orientadorTcc;
    private Aluno alunoAutorTcc;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getObjetivo() {
        return objetivo;
    }
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    public Date getDtInicio() {
        return dtInicio;
    }
    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }
    public Date getDtConclusao() {
        return dtConclusao;
    }
    public void setDtConclusao(Date dtConclusao) {
        this.dtConclusao = dtConclusao;
    }
    public ProfessorOrientadorTcc getOrientadorTcc() {
        return orientadorTcc;
    }
    public void setOrientadorTcc(ProfessorOrientadorTcc orientadorTcc) {
        this.orientadorTcc = orientadorTcc;
    }
    public Aluno getAlunoAutorTcc() {
        return alunoAutorTcc;
    }
    public void setAlunoAutorTcc(Aluno alunoAutorTcc) {
        this.alunoAutorTcc = alunoAutorTcc;
    }

    
}
