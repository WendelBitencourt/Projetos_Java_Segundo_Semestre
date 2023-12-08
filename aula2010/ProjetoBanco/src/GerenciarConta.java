import model.Conta;
import model.Corrente;
import model.Patrimonio;
import model.Poupanca;

public class GerenciarConta {
    public static void main(String[] args) {
        Corrente conta1 = new Corrente(1, "Maromo", 5000);
        Corrente conta2 = new Corrente(2, "Zezinho", 1000);
        Poupanca conta3 = new Poupanca(33, "Maria", 15);
        conta1.depositar(1000);
        conta2.depositar(2000);
        conta3.depositar(7000);
        conta1.sacar(2000);

        Patrimonio gerenciar = new Patrimonio();
        gerenciar.adicionarConta(conta1);
        gerenciar.adicionarConta(conta2);
        gerenciar.adicionarConta(conta3);

        System.out.println("Total depositado no banco");
        System.out.println(gerenciar.verificarPatrimonio());




    }
}