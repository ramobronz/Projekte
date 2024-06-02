package Taschenrechner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormTaschenrechner extends JFrame {
    private JTextField textFieldZahl1;
    private JTextField textFieldZahl2;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonProduct;
    private JButton buttonDiviss;
    private JTextField textFieldSumme;
    private JButton buttonNeu;
    private JButton buttonEnde;
    private JPanel panelMain;
    private JPanel panelmein;
    
    public FormTaschenrechner(){
        this.setTitle("Taschenrechner");
        this.setLocationByPlatform(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelMain);
        this.pack();
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonPlusActionPerformed(e);
                
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonMinusActionPerformed(e);
                
            }
        });
        buttonProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonProductActionPerformed(e);
                
            }
        });
        buttonDiviss.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonDivissActionPerformed(e);
                
            }
        });
        buttonNeu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonNeuActionPerformed(e);
                
            }
        });
        buttonEnde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonEndeActionPerformed(e);
                
            }
        });
    }

    private void buttonEndeActionPerformed(ActionEvent e) {
        textFieldSumme.setText("0");
        textFieldZahl1.setText("0");
        textFieldZahl2.setText("0");
    }

    private void buttonNeuActionPerformed(ActionEvent e) {
        textFieldSumme.setText("0");
        textFieldZahl1.setText("0");
        textFieldZahl2.setText("0");
    }

    private void buttonDivissActionPerformed(ActionEvent e) {
        double divis = (Double.parseDouble(textFieldZahl2.getText())/ Double.parseDouble(textFieldZahl2.getText()));
        String divis2 = Double.toString(divis);
        textFieldSumme.setText(divis2);
    }

    private void buttonProductActionPerformed(ActionEvent e) {
        double product = Double.parseDouble(textFieldZahl2.getText())*Double.parseDouble(textFieldZahl2.getText());
        String product2 = Double.toString(product);
        textFieldSumme.setText(product2);
    }

    private void buttonMinusActionPerformed(ActionEvent e) {
        double minus = Double.parseDouble(textFieldZahl1.getText())-Double.parseDouble(textFieldZahl2.getText());
        String minus2 = Double.toString(minus);
        textFieldSumme.setText(minus2);
    }

    private void buttonPlusActionPerformed(ActionEvent e) {
        double summe = Double.parseDouble(textFieldZahl1.getText())+Double.parseDouble(textFieldZahl2.getText());
        String summe2 =Double.toString(summe);
        textFieldSumme.setText(summe2);
    }
}
