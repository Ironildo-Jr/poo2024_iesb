package br.edu.iesb.poo2024.devlab3;

public class Main {
    public static void main(String[] args) {
        ClasseAbstrataOO concreta1 = new ClasseConcretaOO();
        concreta1.printMenssagem();
        concreta1.metodoConcreto();
        System.out.println(concreta1.msg);
        concreta1.msg = "Essa classe nao eh abstrata! coisa nenhuma!";
        System.out.println(concreta1.msg);

        System.out.println("\n");

        ClasseConcretaOO2 concreta2 = new ClasseConcretaOO2();
        concreta2.printMenssagem();
        concreta2.metodoConcreto();

        System.out.println("\n");

        System.out.println(IGerenciadorArquivo.TIP_ARQUIVO_CSV);

        ClasseConcretaOO3 concreta3 = new ClasseConcretaOO3();
        concreta3.lerArquivoDisco(null, false);
    }
}
