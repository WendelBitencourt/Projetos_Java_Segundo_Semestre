package model;

import java.util.Random;

public class Tabuleiro {
    private int[][] matriz = new int[10][10];
    private int[] palpites = new int[2];

    public void setPalpites(int[] palpites) {
        this.palpites = palpites;
    }

    //Método construtor personalizado
    //Finalidade preencher o tabuleiro (valores entre 1 e 100)
    public Tabuleiro(){
        Random random = new Random();
        //percorrer e preencher a matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = random.nextInt(1,101);
            }
        }
    }
    
    public double jogar(){
        double premio = 0.0;
        int cont = verificar();
        if(cont >= 3){
            premio = 1000.0 * cont;
        }
        exibirTabuleiro();
        return premio;
    }

    private void exibirTabuleiro() {
        //percorrer o tabuleiro olhando sempre para os dois palpites
        //quando for coincidente, faremos uma marca.
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(palpites[0] == matriz[i][j] || palpites[1] == matriz[i][j]){
                    System.out.printf("[%4d]* ", matriz[i][j]);
                }else{
                    System.out.printf("[%4d]  ", matriz[i][j]);
                }
            }
            System.out.println(); //pular linha ao terminar as 10 colunas
        }
    }

    private int verificar() {
        int cont = 0;
        for(int h = 0; h < 2; h++){ //palpite
            for (int i = 0; i < 10; i++) {//linha
                for (int j = 0; j < 10; j++) {//coluna
                    if(palpites[h] == matriz[i][j]) cont++;
                }
            }
        }
        return cont;
    }

}
