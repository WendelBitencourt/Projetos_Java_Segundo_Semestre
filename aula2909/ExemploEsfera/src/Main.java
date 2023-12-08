import model.Esfera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double raio;
        System.out.println("Calculo do volume de uma esfera");
        System.out.println("Digite o valor do raio: ");
        Scanner sc = new Scanner(System.in);
        raio = Double.parseDouble(sc.nextLine());
        Esfera esfera = new Esfera();
        esfera.setRaio(raio);
        System.out.println("Volume é: " + esfera.calcularVolume());
    }
}