import java.util.ArrayList;
import java.util.List;

public class GerenciarAcesso {
    public static List<Autenticacao>  logados =
            new ArrayList<>();

    public static void main(String[] args) {
        Cliente cliente1, cliente2;
        Gerente gerente;
        Secretaria secretaria;
        Operador operador1, operador2;
        Fornecedor fornecedor;
        //Cliente1 e 2 serao criados
        cliente1 = new Cliente();
        cliente2 = new Cliente();
        cliente2.login();
        gerente = new Gerente();
        gerente.login();
        secretaria = new Secretaria();
        secretaria.login();
        operador2 = new Operador();
        //operador2.login() --> nao faz login
        fornecedor = new Fornecedor();
        //fornecedor.login() --> nao faz login
        gerente.logout();
        System.out.println("Numero de logados");
        System.out.println(logados.size());
        System.out.println("Quem está logado?");
        for (Autenticacao obj : logados){
            System.out.println(obj);
        }
    }
}