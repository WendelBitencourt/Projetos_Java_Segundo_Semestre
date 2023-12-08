import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        try{
            System.out.println("Valor de a: ");
            a = sc.nextInt();
            System.out.println("Valor de b: ");
            b = sc.nextInt();
            int soma = a + b;
            System.out.println("Soma: " + soma);
        } catch (InputMismatchException ex){
            System.out.println("Digite um valor inteiro");
        } finally {
            System.out.println("Executei o finally");
        }

    }
}