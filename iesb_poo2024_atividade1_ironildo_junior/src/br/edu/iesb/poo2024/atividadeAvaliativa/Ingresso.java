package br.edu.iesb.poo2024.atividadeAvaliativa;

import java.time.LocalDateTime;
import java.util.List;

public class Ingresso extends ObjetoBase{
    private String tipo;
    private Cliente cliente;
    private Sessao sessao;
    private LocalDateTime horaCompra;
    private double valorPago;
    private static List<Ingresso> ingressos;

    public Ingresso(String tipo, Cliente cliente, double valorPago, Sessao sessao){
        this.tipo = tipo;
        this.valorPago = valorPago;
        horaCompra = LocalDateTime.now();
        this.cliente = cliente;
        this.sessao = sessao;
        super.setId(Util.gerarId(ingressos));

        ingressos.add(this);
    }

    public void imprimirIngresso(){
        System.out.println("Id: " + super.getId() + "\nCliente: " + cliente.getNome() + "\nTipo: " + tipo + "\nValor Pago: R$" + valorPago + "\nHora da Compra: " + horaCompra.getHour() + ":" + horaCompra.getMinute() + "\nSessao: \n");
        sessao.verSessao();
    }
}
