import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("olá " + nome);
        int a, b, soma;
        System.out.println("Digite o valor de a:");
        a = sc.nextInt();
        System.out.println("Digite o valor de b:");
        b = sc.nextInt();
        soma = a + b;
        System.out.println("Valor da soma: " + soma);
    }
}