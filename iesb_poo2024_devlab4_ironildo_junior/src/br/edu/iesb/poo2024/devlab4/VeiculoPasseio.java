package br.edu.iesb.poo2024.devlab4;

public class VeiculoPasseio extends Veiculo
        implements IGerenciaConfiguracoesVeiculo, IGerenciaVeiculoRemotamente, IReportErrosInformacoes {

    @Override
    public void acelerar() {
        // TODO Auto-generated method stub
    }

    @Override
    public void freiar() {
        // TODO Auto-generated method stub
    }

    @Override
    public void fazerCurva() {
        // TODO Auto-generated method stub
    }

    @Override
    public void emitirInformacoesCentral() {
        // TODO Auto-generated method stub
    }

    @Override
    public void emitirErrosCentral() {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean isVeiculoLigado() {
        return true;
    }

    @Override
    public int ligarVeiculo() {
        return 0;
    }

    @Override
    public int desligarVeiculo() {
        return 0;
    }

    @Override
    public int ligarArcondicionado() {
        return 0;
    }

    @Override
    public int obterQuilometragemAtual() {
        return 20000;
    }

    @Override
    public int obterQuilometragemRevisao() {
        return 0;
    }

    @Override
    public void emitirAlertaRevisao() {
        // TODO Auto-generated method stub
    }

    @Override
    public void emitirAlertaAcidente() {
        // TODO Auto-generated method stub
    }
}