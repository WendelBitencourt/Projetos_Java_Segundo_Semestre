package view;

import model.Produto;

import java.util.Scanner;

public class ProdutoView {
    //interface com usuario (UI)
    Produto produto;
    public ProdutoView(){
        produto = new Produto();
        lerDadosUsuario();
    }

    private void lerDadosUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o cod. do produto: ");
        produto.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a descrição do produto: ");
        produto.setDescricao(sc.nextLine());
    }
    public void exibirDadosDoProduto(){
        System.out.println(produto);
    }
}
