package br.edu.iesb.poo2024.devlab3;

public class ClasseConcretaOO extends ClasseAbstrataOO{
    @Override
    public void printMenssagem(){
        System.out.println(">> printMenssagem():" + getClass());
        //System.out.println(msg);
    }

    @Override
    public void metodoConcreto() {
        System.out.println(">> printMenssagem():" + getClass());
    }
}
