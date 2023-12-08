import java.util.Scanner;

public class AcampamentoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Acampamento membro = new Acampamento();
        System.out.println("Digite o nome do escoteiro: ");
        membro.setNome(sc.nextLine());
        System.out.println("Digite a idade do escoteiro: ");
        membro.setIdade(Integer.parseInt(sc.nextLine()));
        membro.imprimir();
        membro.separarGrupo();
        System.out.println(); //pular uma linha
        membro.imprimir();
    }
}
