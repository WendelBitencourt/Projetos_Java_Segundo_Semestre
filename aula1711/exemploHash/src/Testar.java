import java.util.ArrayList;
import java.util.List;

public class Testar {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Juca");
        lista.add(16);
        lista.add(34.5);
        lista.add("Maromo");
        lista.add(System.currentTimeMillis());
        lista.add("Maromo");
        lista.add(56.7f);
        while(lista.contains("Maromo")){
            lista.remove("Maromo");
        }
        System.out.println("Tem: " + lista.size());
        for(Object x : lista){
            System.out.println(x);
        }

        boolean temMaromo = lista.contains("Maromo");
        System.out.println(temMaromo);
        lista.clear();
        System.out.println(lista.size());
    }
}
