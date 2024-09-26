package br.edu.iesb.poo2024.atividadeAvaliativa;

import java.util.List;

public class Sala extends ObjetoBase{
    private int qtdLugares;
    private boolean disponivel;
    private static List<Sala> salas;

    public Sala(int qtdLugares, boolean disponivel) {
        this.qtdLugares = qtdLugares;
        this.disponivel = disponivel;

        super.setId(Util.gerarId(salas));
        salas.add(this);
    }

    public static Sala getSala(int id){
        for (Sala sala : salas){
            if(sala.getId() == id){
                return sala;
            }
        }
        return null;
    }
    public int getQtdLugares() {
        return qtdLugares;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }  
}
