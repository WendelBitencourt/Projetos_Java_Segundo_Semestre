public class Aluno {
    private int ra;
    private String nome;
    private String login;
    private String senha;

    //Construtor padrão
    public Aluno(){

    }
    public Aluno(String login, String senha){
        this.login = login;
        this.senha = senha;
        //faria a logica de verificacao
    }

    public Aluno(int ra, String nome, String login, String senha) {
        this(login, senha);
        this.ra = ra;
        this.nome = nome;
    }
}
