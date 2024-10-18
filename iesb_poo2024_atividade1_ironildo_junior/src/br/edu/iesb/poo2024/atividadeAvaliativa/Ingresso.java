package br.edu.iesb.poo2024.atividadeAvaliativa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ingresso extends ObjetoBase{
    private String tipo;
    private Cliente cliente;
    private Sessao sessao;
    private LocalDateTime horaCompra;
    private double valorPago;
    private static List<Ingresso> ingressos= new ArrayList<>();

    public Ingresso(String tipo, Cliente cliente, double valorPago, Sessao sessao) throws CinemaExcecoes{
        if (cliente == null || sessao == null){
            throw new CinemaExcecoes(EnumExcecoes.INGRESSO_CLIENTE);
        }

        this.tipo = tipo;
        this.valorPago = valorPago;
        horaCompra = LocalDateTime.now();
        this.cliente = cliente;
        this.sessao = sessao;
        super.setId(Util.gerarId(ingressos));

        ingressos.add(this);
    }

    public void imprimirIngresso(){
        System.out.println("\n\n--------------Ingresso--------------\n");
        System.out.println("Id: " + super.getId() + "\nCliente: " + cliente.getNome() + "\nTipo: " + tipo + "\nValor Pago: R$" + valorPago + "\nHora da Compra: " + horaCompra.getHour() + ":" + horaCompra.getMinute());
        sessao.verSessao();
    }
}
