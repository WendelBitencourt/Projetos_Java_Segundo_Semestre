import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        ContaTeste gerenciar = new ContaTeste();
        do{
            //montar o menu
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Imprimir Saldo");
            System.out.println("9. Sair");
            System.out.println("Escolha sua opcao :");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execDepositar();
                    break;
                case 3:
                    gerenciar.execSacar();
                    break;
                case 4:
                    gerenciar.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao!=9);
    }
    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a conta: ");
        cc.setConta(sc.nextLine());
        System.out.println("Digite a agencia: ");
        cc.setAgencia(sc.nextLine());
        System.out.println("Digite o nome do cliente: ");
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Conta cadastrada com sucesso...");
    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execSacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        boolean ok = cc.sacar(valor);
        if(ok){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo suficiente para o saque");
        }
    }
    public void execDepositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
        System.out.println("Deposito efetuado sucesso");
    }
}
