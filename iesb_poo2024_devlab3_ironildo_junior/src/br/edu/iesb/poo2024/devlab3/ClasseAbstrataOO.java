package br.edu.iesb.poo2024.devlab3;

public abstract class ClasseAbstrataOO {
    protected String msg = "Essa classe eh abstrata";

    public abstract void printMenssagem();

    public void metodoConcreto(){
        System.out.println("metodo concreto da classe abstrata");
    }
}
