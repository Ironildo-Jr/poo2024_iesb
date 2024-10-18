package br.edu.iesb.poo2024.atividadeAvaliativa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sessao extends ObjetoBase{
    private Filme filme;
    private Sala sala;
    private LocalDateTime horario;
    private int qtdMaximoIngressos;
    private int qtdIngressosVendidos;
    private static List<Sessao> sessoes = new ArrayList<>();

    public void cadastrarSessao(int idFilme, int idSala, LocalDateTime horario) throws CinemaExcecoes {
        filme = Filme.getFilme(idFilme);

        Sala sala = Sala.getSala(idSala);
        if(sala == null || !sala.isDisponivel()){
            throw new CinemaExcecoes(EnumExcecoes.SALA);
        }
        sala.setDisponivel(false);
        this.sala = sala;
        this.horario = horario;
        this.qtdMaximoIngressos = sala.getQtdLugares();
        this.qtdIngressosVendidos = 0;

        super.setId(Util.gerarId(sessoes));

        sessoes.add(this);
    }

    public void addIngressoVendido(){
        qtdIngressosVendidos +=1;
    }

    public void verSessao(){
        System.out.println("\n\n--------------Sessao--------------\n");
        System.out.println("Id: "+ super.getId() + "\nFilme: " + filme.getNome() + "\nSala: " + sala.getId() + "\nHorario: " + horario.getHour() + ":"+ horario.getMinute() + "\nQuantidade Maxima de Ingressos: " + qtdMaximoIngressos + "\nIngressos vendido:" + qtdIngressosVendidos); 
    }

    public static Sessao getSessao(int id) throws CinemaExcecoes{
        if(id <= 0){
            throw new CinemaExcecoes(EnumExcecoes.ID_INVALIDO);
        }
        for (Sessao sessao: sessoes){
            if(sessao.getId() == id){
                return sessao;
            }
        }
        return null;
    }
    public Filme getFilme(){
        return filme;
    }
    public int getQtdMaximoIngressos() {
        return qtdMaximoIngressos;
    }
    public int getQtdIngressosVendidos() {
        return qtdIngressosVendidos;
    }
}
