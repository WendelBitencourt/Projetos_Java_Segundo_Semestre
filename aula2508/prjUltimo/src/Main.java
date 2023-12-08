import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loja;
        double valor1, valor2;
        System.out.println("Digite o valor 1: ");
        valor1 = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o nome da loja: ");
        loja = sc.nextLine();
        System.out.println("Digite o valor 2: ");
        valor2 = Double.parseDouble(sc.nextLine());
        System.out.println("Compra na loja " + loja);
        System.out.printf("Produto 1, R$ %.2f \n", valor1);
        System.out.println("Produto 2, R$ " + valor2);
    }
}