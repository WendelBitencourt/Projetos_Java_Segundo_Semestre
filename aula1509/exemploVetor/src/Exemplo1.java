public class Exemplo1 {
    public static void main(String[] args) {
        int[] valores = { 3, 5, 8, 10, 1, 7};
        //como vejo o tamanho ?
        System.out.println("Tamanho: "+ valores.length);
        System.out.println("Quais são eles ?");
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

    }
}