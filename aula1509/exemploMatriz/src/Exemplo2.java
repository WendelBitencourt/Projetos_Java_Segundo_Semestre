public class Exemplo2 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            matriz[i][i] = 1;
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
