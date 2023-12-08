package view;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaixaView extends JFrame implements ActionListener {
    //definir as propriedade - atributos
    private Dimension dLabel, dTextField, dButton, dFrame, dTextArea;
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;
    private Caixa caixa;

    public CaixaView(){
        //Instanciar o nosso caixa
        caixa = new Caixa();
        //Definir aparencia e comportamento da janela e dos outros objetos
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150,20);
        dButton = new Dimension(95, 20);
        dTextArea = new Dimension(300, 140);
        setSize(dFrame);
        setTitle("Gerenciamento de Caixa");
        setResizable(false);
        setLayout(null);//sem gerenciador de layout
        setLocationRelativeTo(null); //centro
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25, 150);
        cmdEntrada.addActionListener(this);
        add(cmdEntrada);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(225, 150);
        cmdRetirada.addActionListener(this);
        add(cmdRetirada);

        cmdConsulta = new Button("Saldo");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        cmdConsulta.addActionListener(this);
        add(cmdConsulta);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225, 185);
        cmdSair.addActionListener(this);
        add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        add(txtMsg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdEntrada){
            try{
                double valor = Double.parseDouble(txtValor.getText());
                caixa.depositar(valor);
                String mensagem = "Depósito realizado com sucesso";
                txtMsg.append(mensagem + "\n");
                txtValor.setText(null);
                txtValor.requestFocus();
                txtSaldo.setText(null);
            }catch (Exception ex){
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: " + ex.getMessage(),
                        "Aconteceu um erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
            return;
        }
        if(e.getSource()==cmdRetirada){
            try {
                double valor = Double.parseDouble(txtValor.getText());
                caixa.sacar(valor);
                String mensagem = "Saque efetuado com sucesso";
                txtMsg.append(mensagem + "\n");
                txtValor.setText(null);
                txtValor.requestFocus();
                txtSaldo.setText(null);
            }catch (Exception ex){
                JOptionPane.showMessageDialog(
                        null,
                        "Erro: " + ex.getMessage(),
                        "Aconteceu um erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
            return;
        }
        if(e.getSource()==cmdConsulta){
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
            String mensagem = "Saldo consultado R$ " + caixa.getSaldo() + "\n";
            txtMsg.append(mensagem + "\n");
            txtValor.setText(null);
            txtValor.requestFocus();
            return;
        }
        if(e.getSource()==cmdSair){
            JOptionPane.showMessageDialog(
                    null,
                    "Fechando o programa!",
                    "Fim de Operação",
                    JOptionPane.INFORMATION_MESSAGE
            );
            System.exit(0);
        }
    }
}
