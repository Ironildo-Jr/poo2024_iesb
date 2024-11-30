package br.edu.iesb.poo2024.atividadeAvaliativa.view;

import br.edu.iesb.poo2024.atividadeAvaliativa.controllers.exceptions.CompraException;
import br.edu.iesb.poo2024.atividadeAvaliativa.controllers.services.CarrinhoService;
import br.edu.iesb.poo2024.atividadeAvaliativa.controllers.services.ClienteService;
import br.edu.iesb.poo2024.atividadeAvaliativa.controllers.services.ProdutoService;

public class Main {
    public static void main(String args[]) throws CompraException{

        System.out.println("Ironildo Junior - 2312082021");
        
        // HU - Carrinho de compras
        // Descricao HU - Permitir listar o(s) produto(s) desejados antes de realizar o pagamento e ver o total do próprio carrinho.

        ClienteService clienteService = new ClienteService();
        ProdutoService produtoService = new ProdutoService();
        CarrinhoService carrinhoService = new CarrinhoService();

        clienteService.cadastrarCliente("Iron", "1234");
        clienteService.cadastrarCliente("Bruno", "4321");
        clienteService.cadastrarCliente("Iron2", "1234");

        produtoService.cadastrarProduto("Celular", "iphone 17 pra mim", 10000, 2);
        produtoService.cadastrarProduto("Notebook", "asus book", 5000, 1);

        carrinhoService.addAoCarrinho(1, "1234");
        carrinhoService.addAoCarrinho(2, "4321");
        carrinhoService.addAoCarrinho(1, "0");

        System.out.println("-------------- Carrinho Iron --------------");
        System.out.println(carrinhoService.buscarCarrinho("1234"));

        System.out.println("-------------- Carrinho Bruno --------------");
        System.out.println(carrinhoService.buscarCarrinho("4321"));

        // HU - Área do comprador
        // Descricao - ver Histórico de compras do cliente

        clienteService.comprarCarrinho("1234", "credito");
        clienteService.comprarCarrinho("4321", "pix");

        carrinhoService.addAoCarrinho(1, "4321");
        clienteService.comprarCarrinho("1234", "credito");

        System.out.println("-------------- Compras Iron --------------");
        System.out.println(clienteService.historicoCompras("1234"));

        System.out.println("-------------- Compras Bruno --------------");
        System.out.println(clienteService.historicoCompras("4321"));
    }
}
