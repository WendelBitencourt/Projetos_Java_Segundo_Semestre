public class Acampamento {
    private String nome;
    private char equipe;
    private int idade;

    //métodos gets and sets [ALT + Insert]


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getEquipe() {
        return equipe;
    }

    public void setEquipe(char equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //métodos
    public void imprimir() {
        System.out.println("nome = " + nome);
        System.out.println("equipe = " + equipe);
        System.out.println("idade = " + idade);
    }
    public void separarGrupo(){
        if(idade <=5){
            equipe = '-';
            return;
        }
        if(idade <=10){
            equipe = 'A';
            return;
        }
        if(idade <=20){
            equipe = 'B';
            return;
        }
        equipe = 'C';
    }
}
