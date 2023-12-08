package model;

public class Corrente extends Conta {
    private double limiteCheque;

    public Corrente(int numero, String nomeCliente, double limiteCheque) {
        super(numero, nomeCliente);
        this.limiteCheque = limiteCheque;
    }

    public double getLimiteCheque() {
        return limiteCheque;
    }

    public void setLimiteCheque(double limiteCheque) {
        this.limiteCheque = limiteCheque;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= (saldo + limiteCheque)){
            saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Limite Cheque: " + limiteCheque + "\n";
    }
}
