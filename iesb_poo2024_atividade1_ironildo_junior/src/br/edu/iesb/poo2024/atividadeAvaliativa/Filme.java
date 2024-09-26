package br.edu.iesb.poo2024.atividadeAvaliativa;

import java.util.ArrayList;
import java.util.List;

public class Filme extends ObjetoBase{
    private String nome;
    private String duracao;
    private int classificacaoEtaria;
    private String genero;
    private static List<Filme> filmes = new ArrayList<>();

    public Filme(String nome, String duracao, int classificacaoEtaria, String genero){
        this.nome = nome;
        this.duracao = duracao;
        this.classificacaoEtaria = classificacaoEtaria;
        this.genero = genero;

        super.setId(Util.gerarId(filmes));
        filmes.add(this);
    }

    public static Filme getFilme(int id){
        for (Filme filme : filmes){
            if(filme.getId() == id){
                return filme;
            }
        }
        return null;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }
    public void setClassificacaoEtaria(int classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
