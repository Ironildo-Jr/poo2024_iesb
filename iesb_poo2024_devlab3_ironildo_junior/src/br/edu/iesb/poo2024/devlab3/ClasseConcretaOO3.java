package br.edu.iesb.poo2024.devlab3;

public class ClasseConcretaOO3 implements IGerenciadorArquivo{

    @Override
    public void lerArquivoDisco(String pathArquivo, boolean isPrint) {
        System.out.println("Lendo Arquivo");
        System.out.println(">> " + getClass());
    }
    
}
