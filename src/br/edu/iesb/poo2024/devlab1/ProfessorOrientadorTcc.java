package br.edu.iesb.poo2024.devlab1;

import java.util.List;

public class ProfessorOrientadorTcc extends Professor {
    private int id;
    private int qtdVagasOrientacao;
    private List<LinhaPesquisaOrientacao> listaLinhaPesquisa;

    public ProfessorOrientadorTcc(){
        super();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQtdVagasOrientacao() {
        return qtdVagasOrientacao;
    }
    public void setQtdVagasOrientacao(int qtdVagasOrientacao) {
        this.qtdVagasOrientacao = qtdVagasOrientacao;
    }
    public List<LinhaPesquisaOrientacao> getListaLinhaPesquisa() {
        return listaLinhaPesquisa;
    }
    public void setListaLinhaPesquisa(List<LinhaPesquisaOrientacao> listaLinhaPesquisa) {
        this.listaLinhaPesquisa = listaLinhaPesquisa;
    }

    
}
