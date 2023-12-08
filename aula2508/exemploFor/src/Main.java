public class Main {
    public static void main(String[] args) {
        //Fazer uma contagem de 1 a 10
        for (int i = 1; i <=10 ; i++) {
            if(i % 5 ==0) continue;
            System.out.println(i);
        }
        int soma = 500;
       do{
            soma+= 3;
        }while (soma < 100);
        System.out.println("Valor final: " + soma);
    }
}