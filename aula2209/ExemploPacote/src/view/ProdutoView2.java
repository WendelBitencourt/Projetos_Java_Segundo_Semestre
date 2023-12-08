package view;

import model.Produto;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ProdutoView2 {
    private JTextField textField1;
    private JTextField textField2;
    private JButton gravarButton;
    private JPanel painelProduto;

    private Produto produto;
    public JPanel getPainelProduto() {
        return painelProduto;
    }

    public ProdutoView2(){
        produto = new Produto();

        gravarButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                produto.setCodigo(Integer.parseInt(textField1.getText()));
                produto.setDescricao(textField2.getText());

                JOptionPane.showMessageDialog(
                        null,
                        produto.toString(),
                        "Produto",
                        JOptionPane.INFORMATION_MESSAGE

                );
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
