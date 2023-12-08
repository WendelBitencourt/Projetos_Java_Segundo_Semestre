import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];
        //pedir os cinco valores para o usuario
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite um numero: ");
            valores[i] = Integer.parseInt(sc.nextLine());
        }
        //Vamos ver os valores
        for(int x: valores){
            System.out.println(x);
        }
    }
}
