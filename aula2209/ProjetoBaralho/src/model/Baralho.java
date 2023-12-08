package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public Baralho(){
        //criar a lista vazia
        cartas = new ArrayList<>();
        montar();
    }

    private void montar() {
        for(Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                Carta carta = new Carta();
                carta.setNaipe(naipe);
                carta.setValor(valor);
                cartas.add(carta);
            }
        }
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public void mostrarBaralho(){
        for(Carta carta : cartas){
            System.out.println(carta);
        }
    }


}
