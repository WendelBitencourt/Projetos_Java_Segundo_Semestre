/**
 * @author Maromo
 * @since 2023 Aug
 * Classe Main, exemplo da aul ado dia 25 de agosto
 */
public class Main {

    /**
     * Método main. Iniciar o aplicativo
     * @param args
     */
    public static void main(String[] args) {
        String valor =  "150";
        //comentário de uma linha
        int qtd = 2;
        double total =qtd * Double.parseDouble(valor);
        System.out.println("Valor total: " + total);

        double x = 1500.0;
        String resultado = Double.toString(x);
        System.out.println("Resultado texto: " + resultado);
        /*
            mais do que uma linha
            de comentário
         */
        double conta = 10 / (double)3;
        System.out.println("Conta: " + conta);
    }
}