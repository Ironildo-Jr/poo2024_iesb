package br.edu.iesb.poo2024.atividadeAvaliativa;

import java.time.LocalDateTime;
/*
 * Author Ironildo
 */
public class CinemaMain {
    public static void main(String[] args) {

        System.out.println("Ironildo Junior - 2312082021");
        
        new Filme("Titanic", "90min", 15, "Drama");
        new Filme("Avatar", "180min",10,"Aventura");

        new Sala(50,true);
        new Sala(50,true);
        new Sala(20,true);

        new Sessao().cadastrarSessao(1, 1, LocalDateTime.of(24,10,15,16,30));
        // teste de erro sala ja ocupada
        // new Sessao().cadastrarSessao(1, 1, LocalDateTime.of(24,10,16,17,0));
        new Sessao().cadastrarSessao(1, 2, LocalDateTime.of(24,10,16,17,0));
        new Sessao().cadastrarSessao(2, 3, LocalDateTime.of(24,10,15,17,0));

        new Cliente("Ironildo", "12312312354", LocalDateTime.of(2003, 10, 16, 0, 0, 0));
        new Cliente("Bruno", "32132132145", LocalDateTime.of(2010, 1, 1, 0, 0, 0));

        Funcionario func1 = new Funcionario("Lucas", "Vendedor");

        Sessao sessaoIron = Sessao.getSessao(1);
        sessaoIron.verSessao();

        Ingresso ingressoIron = func1.venderIngresso("12312312354", 1, "inteira", 40.9);
        ingressoIron.imprimirIngresso();

        Ingresso ingressoBruno = func1.venderIngresso("32132132145", 3, "meia", 15.5);
        ingressoBruno.imprimirIngresso();

        // Teste erro sessao invalida
        // Ingresso ingressoIron2 = func1.venderIngresso("12312312354", 0, "inteira", 40.90);
        // ingressoIron2.imprimirIngresso();

        // Teste erro cliente invalido
        // Ingresso ingressoIron3 = func1.venderIngresso("", 1, "inteira", 40.90);
        // ingressoIron3.imprimirIngresso();

        // Teste erro cliente n tem idade
        // Ingresso ingressoBruno2 = func1.venderIngresso("32132132145", 1, "meia", 20.45);
        // ingressoBruno2.imprimirIngresso();
    }
}
