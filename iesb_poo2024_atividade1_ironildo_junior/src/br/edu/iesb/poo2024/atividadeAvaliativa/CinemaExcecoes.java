package br.edu.iesb.poo2024.atividadeAvaliativa;

public class CinemaExcecoes extends Exception{
    public CinemaExcecoes(){
    }

    public CinemaExcecoes(EnumExcecoes mensagem){
        super(mensagem.getMensagem());
    }
}
