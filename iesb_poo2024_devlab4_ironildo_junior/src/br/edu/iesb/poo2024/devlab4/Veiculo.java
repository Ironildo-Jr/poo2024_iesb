package br.edu.iesb.poo2024.devlab4;

public abstract class Veiculo {
    protected String nPlaca;
    protected String cor;
    protected String marca;
    protected String modelo;
    protected String tipo;
    protected boolean isExigeLicencaDiferente;

    // metodo abstrato
    public abstract void acelerar();
    public abstract void freiar();
    public abstract void fazerCurva();

    // metodo concreto
    public void emitirAlertaSonoro(){
        System.out.println(">> Alerta de colisão! - " + getClass());
    }

    public String getnPlaca() {
        return nPlaca;
    }
    public void setnPlaca(String nPlaca) {
        this.nPlaca = nPlaca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public boolean isExigeLicencaDiferente() {
        return isExigeLicencaDiferente;
    }
    public void setExigeLicencaDiferente(boolean isExigeLicencaDiferente) {
        this.isExigeLicencaDiferente = isExigeLicencaDiferente;
    }
}
