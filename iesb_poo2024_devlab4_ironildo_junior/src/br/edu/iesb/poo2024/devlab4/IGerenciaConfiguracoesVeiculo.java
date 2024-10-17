package br.edu.iesb.poo2024.devlab4;

public interface IGerenciaConfiguracoesVeiculo {
    public int obterQuilometragemAtual();
    public int obterQuilometragemRevisao();
    public void emitirAlertaRevisao();
    public void emitirAlertaAcidente();
}
