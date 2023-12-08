public class Gerente extends Funcionario
        implements Autenticacao{

    @Override
    public void login() {
        System.out.println("Gerente Logou");
        GerenciarAcesso.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Gerente saiu do sistema");
        GerenciarAcesso.logados.remove(this);
    }
}
