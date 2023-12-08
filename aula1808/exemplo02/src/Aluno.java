public class Aluno {
    //Atributos
    public int ra;
    public String nome;
    public String curso;
    public int idade;
    public String email;
    //métodos - funções
    public void matricular(){
        //lógica para matricular um aluno
        System.out.println("Aluno: " + nome);
        System.out.println("Foi matriculado com o RA: " + ra);
    }
    public void listar(){
        //imprimir na tela os dados do aluno
        System.out.println("ra = " + ra);
        System.out.println("nome = " + nome);
        System.out.println("curso = " + curso);
        System.out.println("idade = " + idade);
        System.out.println("email = " + email);
    }
}
