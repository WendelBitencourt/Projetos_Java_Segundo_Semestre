public class AlunoTeste {
    public static void main(String[] args) {
        //Joaozinho vai ser nosso aluno
        Aluno aluno1 = new Aluno();
        aluno1.ra = 11;
        aluno1.nome = "Joao Carlos";
        aluno1.curso = "DSM";
        aluno1.idade = 23;
        aluno1.email = "joao@gmail.com";
        //matricular o joao
        aluno1.matricular();
        //imprimir os dados do joao na tela
        aluno1.listar();
    }
}