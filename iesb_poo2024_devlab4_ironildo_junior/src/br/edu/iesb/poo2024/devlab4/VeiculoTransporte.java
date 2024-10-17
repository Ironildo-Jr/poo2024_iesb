package br.edu.iesb.poo2024.devlab4;

public class VeiculoTransporte extends Veiculo{

    @Override
    public void emitirAlertaSonoro() {
        super.emitirAlertaSonoro();
        System.out.println(">> Alerta sonoro de ônibus (mais alto ainda)! - " + getClass().getSimpleName());
    }

    @Override
    public void acelerar() {
        // TODO Auto-generated method stub
    }

    @Override
    public void freiar() {
        // TODO Auto-generated method stub
    }

    @Override
    public void fazerCurva() {
        // TODO Auto-generated method stub
    }
    
}
