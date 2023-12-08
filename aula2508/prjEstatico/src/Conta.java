public class Conta {
    public int numConta;
    public String nomeCliente;
    public double saldo;
    public static double cpmf = 0.0038;

    //métodos
    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
        double taxa = valor * cpmf;
        saldo -= (taxa + valor);
    }


}
