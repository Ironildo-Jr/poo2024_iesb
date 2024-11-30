package br.edu.iesb.poo2024.atividadeAvaliativa.controllers.exceptions;

public class ClienteException extends Exception{
    public ClienteException () {}

    public ClienteException (String message) {
        super (message);
    }
}
