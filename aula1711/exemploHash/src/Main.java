import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(99, "Antonio");
        Pessoa p2 = new Pessoa(12, "Maria");
        Pessoa p3 = new Pessoa(1, "Tereza");
        Pessoa p4 = new Pessoa(128, "Jurema");
        //Generic
        List<Pessoa> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        Collections.sort(lista);
        for (Pessoa p : lista){
            System.out.println("Id: " + p.getIdPessoa() +
                    " nome: " + p.getNome());
        }
        //Usuario pergunta se alguem esta na lista
        Scanner sc = new Scanner(System.in);
        int codigo;
        System.out.println("Digite o codigo da pessoa procurada: ");
        codigo = Integer.parseInt(sc.nextLine());
        Pessoa pessoaProc = new Pessoa();
        pessoaProc.setIdPessoa(codigo);
        if(lista.contains(pessoaProc)){
            System.out.println("Encontrei na lista");
            int indice = lista.indexOf(pessoaProc);
            pessoaProc = lista.get(indice);
            System.out.println("Nome: " + pessoaProc.getNome());
        }else{
            System.out.println("Nao esta na lista");
        }
    }
}