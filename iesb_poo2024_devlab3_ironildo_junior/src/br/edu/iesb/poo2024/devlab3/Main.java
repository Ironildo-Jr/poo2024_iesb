package br.edu.iesb.poo2024.devlab3;
public class Main {
    public static void main(String[] args) {
        ClasseAbstrataOO concreta1 = new ClasseConcretaOO();
        concreta1.printMenssagem();
        concreta1.metodoConcreto();

        ClasseConcretaOO2 concreta2 = new ClasseConcretaOO2();
        concreta2.printMenssagem();
        concreta2.metodoConcreto();
    }
}
