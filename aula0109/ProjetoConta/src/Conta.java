public class Conta {
    private String conta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    //métodos
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void imprimir(){
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
        System.out.println("nomeCliente = " + nomeCliente);
    }
}
