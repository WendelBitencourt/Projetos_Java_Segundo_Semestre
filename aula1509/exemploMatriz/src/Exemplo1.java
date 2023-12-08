import java.util.Random;

public class Exemplo1 {
    public static void main(String[] args) {
        Random randomico = new Random();
        int[][] matriz = new int[5][5];
        //preencher as linhas e colunas
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = randomico.nextInt(1,10);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("[%2d] ", matriz[i][j]);
            }
            //pula uma linha
            System.out.println();
        }
    }
}