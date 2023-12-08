package model;

public abstract class Conta {
    protected int numero;
    protected String nomeCliente;
    protected double saldo;

    public Conta(int numero, String nomeCliente){
        this.numero = numero;
        this.nomeCliente = nomeCliente;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }
    }

    @Override
    public String toString() {
        return "Dados da conta \n" +
                "Num: " + numero + "\n" +
                "Cliente: " + nomeCliente + "\n" +
                "Saldo R$ " + saldo + "\n";
    }
}
