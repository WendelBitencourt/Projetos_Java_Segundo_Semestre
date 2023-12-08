public class Main {
    public static void main(String[] args) {
        Conta.cpmf = 0.0075;
        Conta conta1, conta2;
        //Vou criar a conta1
        conta1 = new Conta();

        conta1.numConta = 10;
        conta1.nomeCliente = "Ze";
        conta1.depositar(1000);
        conta1.sacar(100);
        System.out.println("Saldo: " + conta1.saldo);
        //vou criar a conta2
        conta2 = new Conta();
        conta2.numConta = 20;
        conta2.nomeCliente = "Maria";
        conta2.depositar(500);
        conta2.sacar(100);
        System.out.println("Saldo: " + conta2.saldo);
    }
}