package br.edu.iesb.poo2024.devlab4;

public class CarroSedan extends VeiculoPasseio {
    public void metodoEspecificoCarroSedan(){
        if(super.isVeiculoLigado()){
            System.out.println("O carro esta ligado!");
        }
    }

    @Override
    public int obterQuilometragemAtual(){
        return 15000;
    }
}
