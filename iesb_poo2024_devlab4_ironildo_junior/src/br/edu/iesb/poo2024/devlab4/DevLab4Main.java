package br.edu.iesb.poo2024.devlab4;

public class DevLab4Main {
    public static void main(String[] args) {
        VeiculoTransporte onibus = new VeiculoTransporte();
        onibus.emitirAlertaSonoro();

        CarroSedan sedan = new CarroSedan();
        sedan.setCor("branco");
        sedan.setMarca("BMW");

        Veiculo passeio = new VeiculoPasseio();
        Veiculo transporte = new VeiculoTransporte();
        Veiculo utilitario = new VeiculoUtilitário();

        IGerenciaConfiguracoesVeiculo gerenciaConfigVeiculo = new VeiculoPasseio();
        System.out.println(
                ">> Quilometragem atual do Veiculo de Passeio: " + gerenciaConfigVeiculo.obterQuilometragemAtual());

        IGerenciaConfiguracoesVeiculo gerenciaConfigSedan = new CarroSedan();
        System.out.println(
                ">> Quilometragem atual do carro de sedan: " + gerenciaConfigSedan.obterQuilometragemAtual());
    }
}
