import java.util.Scanner;

public class ComputadorTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computador computador = new Computador();
        System.out.println("Digite a marca do computador: ");
        computador.setMarca(sc.nextLine());
        System.out.println("Digite a cor do computador: ");
        computador.setCor(sc.nextLine());
        System.out.println("Digite o modelo do computador: ");
        computador.setModelo(sc.nextLine());
        System.out.println("Digite o numero de serie do computador: ");
        computador.setNumeroSerie(Long.parseLong(sc.nextLine()));
        System.out.println("Digite a preco do computador: ");
        computador.setPreco(Double.parseDouble(sc.nextLine()));
        //invocar o imprmir
        computador.imprimir();
        //invocar o calcular valor
        computador.calcularValor();
        System.out.println(); //pular linha
        computador.imprimir();
        //pedir um novo preco ao usuario
        System.out.println("Digite o novo preco do computador: ");
        double valor = Double.parseDouble(sc.nextLine());
        boolean ok = computador.alterarValor(valor);
        if(ok){
            System.out.println("Valor alterado com sucesso");
        }else{
            System.out.println("Valor invalido para a solicitacao");
        }
        computador.imprimir();
    }
}
