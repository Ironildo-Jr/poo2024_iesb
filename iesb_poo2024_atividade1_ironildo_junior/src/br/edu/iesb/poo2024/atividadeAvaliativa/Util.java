package br.edu.iesb.poo2024.atividadeAvaliativa;

import java.util.List;

public class Util {
    public static int gerarId(List<? extends ObjetoBase> lista){
        int maior = 0;
        for(ObjetoBase l: lista){
            if (l.getId() >= maior){
                maior = l.getId();
            }
        }
        return maior + 1;
    }
}
