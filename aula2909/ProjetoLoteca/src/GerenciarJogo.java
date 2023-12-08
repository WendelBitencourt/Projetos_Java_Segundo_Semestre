import model.Tabuleiro;

import java.util.Scanner;

public class GerenciarJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("JOGO DA SORTE - LOTECA BOA SORTE");
        System.out.println("Jogue dois palpites e verifique sua sorte");
        int[] palpites = new int[2];
        System.out.println("Digite o palpite 1: ");
        palpites[0] = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o palpite 2: ");
        palpites[1] = Integer.parseInt(sc.nextLine());
        //instanciar o jogo
        Tabuleiro jogo = new Tabuleiro();
        jogo.setPalpites(palpites);
        double premio = jogo.jogar();
        if(premio > 0){
            System.out.println("Parabéns passe no caixa e receba ");
            System.out.println("R$ " + premio);
        }else{
            System.out.println("Tá SEM sorte hoje, jogue na MegaSena");
        }
    }
}