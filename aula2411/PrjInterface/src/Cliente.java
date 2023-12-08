public class Cliente implements Autenticacao{
    @Override
    public void login() {
        System.out.println("Cliente logou");
        GerenciarAcesso.logados.add(this);
    }

    @Override
    public void logout() {
        System.out.println("Cliente efetuou logout");
        GerenciarAcesso.logados.remove(this);
    }
}
