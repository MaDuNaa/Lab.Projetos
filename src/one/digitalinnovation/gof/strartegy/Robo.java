package one.digitalinnovation.gof.strartegy;

public class Robo {

    private Comportamento Comportamento;

    public void setComportamento(one.digitalinnovation.gof.strartegy.Comportamento comportamento) {
        this.Comportamento = comportamento;
    }

    public void mover() {
        Comportamento.mover();
    }
}
