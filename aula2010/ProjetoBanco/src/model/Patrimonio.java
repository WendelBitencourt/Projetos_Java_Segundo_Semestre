package model;

import java.util.ArrayList;
import java.util.List;

public class Patrimonio {
    private List<Conta> lista = new ArrayList<>();

    public void adicionarConta(Conta conta){
        lista.add(conta);
    }

    public double verificarPatrimonio(){
        double total = 0;
        for(Conta c : lista){
            total += c.getSaldo();
        }
        return total;
    }

}
