public class Secretaria extends Funcionario
        implements Autenticacao{
    @Override
    public void login() {
        System.out.println("Secretaria logou");
        GerenciarAcesso.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Secretaria efetuou logout");
        GerenciarAcesso.logados.remove(this);
    }
}
