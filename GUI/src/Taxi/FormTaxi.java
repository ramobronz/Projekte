package Taxi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormTaxi extends JFrame {
    private JComboBox comboBox1;
    private JCheckBox checkBox1Nachtfahrt;
    private JCheckBox checkBox2Kindersitz;
    private JCheckBox checkBox3Bar;
    private JTextField textField1Km;
    private JLabel Lebel1Auswahl;
    private JLabel Lebel2Km;
    private JButton ButtonEnde;
    private JButton ButtonNeu;
    private JButton ButtonDruken;
    private JButton buttonBerchnen;
    private JPanel Rechnung;
    private JLabel LebelNettobetrag;
    private JButton ButtonNetto;
    private JLabel LebelMehrwersteuer;
    private JButton buttonMehr;
    private JLabel LebelBrutto;
    private JButton buttonBrutto;
    private JPanel Eingaben;
    private JPanel panelMain;
    private JLabel Gast;
    private JTextField textFieldFahrgäste;

    public FormTaxi(){
        this.setTitle("Taxi");
        this.setLocationByPlatform(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelMain);
        this.pack();
        textField1Km.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        checkBox1Nachtfahrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        checkBox2Kindersitz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        checkBox3Bar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ButtonNetto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        buttonMehr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonBrutto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonBerchnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

// Normal Taxi
                if (comboBox1.getSelectedItem().equals("Normal Taxi")){
                    double netto = (Double.parseDouble(textField1Km.getText())*0.5)+3.90;
                    String netto1 = Double.toString(netto);
                    ButtonNetto.setText(netto1);

                    double x =Double.parseDouble(textField1Km.getText());
                    double stuer;
                    double summe=0.0;
                    if (x>=50){
                         stuer = (netto/100)*19;
                        String stuer1 = Double.toString(stuer);
                        buttonMehr.setText(stuer1);
                        summe = stuer+netto;
                        String summe1 = Double.toString(summe);
                        buttonBrutto.setText(summe1);
                    }else if (x<50){
                         stuer = (netto/100)*7;
                        String stuer1 = Double.toString(stuer);
                        buttonMehr.setText(stuer1);
                        summe = stuer+netto;
                        String summe1 = Double.toString(summe);
                        buttonBrutto.setText(summe1);
                    }






        //NormaleTaxi Kindersitz
                    if (checkBox2Kindersitz.isSelected()){
                        double kindersitz = summe+1;
                        String kindersitz1 = Double.toString(kindersitz);
                        buttonBrutto.setText(kindersitz1);
       // NormaleTaxi NAchtfahrt             }else if (checkBox1Nachtfahrt.isSelected()){
                       double neusumme =(summe/100)*10;
                       double neusumme1 =summe+neusumme;
                       String neusumme2 =Double.toString(neusumme1);
                       buttonMehr.setText(neusumme2);
       //NormaleTaxi Bar             } if (checkBox3Bar.isSelected()) {
                        double bar = Double.parseDouble(textFieldFahrgäste.getText())*15;
                        double bar1 = summe+bar;
                        String bar2 = Double.toString(bar1);
                        buttonBrutto.setText(bar2);

                    }
                }
                else if (comboBox1.getSelectedItem().equals("Strechlimousine")){  //        Strechlimousine
                    double netto =( Double.parseDouble(textField1Km.getText())*2)+3.90;
                    String netto1 = Double.toString(netto);
                    ButtonNetto.setText(netto1);

                    double x =Double.parseDouble(textField1Km.getText());     // km
                    double stuer=0.0;
                    double summe=0.0;
                    if (x>=50){                                               // Merh als 50km
                        stuer = (netto/100)*19;
                        String stuer1 = Double.toString(stuer);
                        buttonMehr.setText(stuer1);
                        summe = stuer+netto;
                        String summe1 = Double.toString(summe);
                        buttonBrutto.setText(summe1);
                    }else if (x<50){                                          // unter 50km
                        stuer = (netto/100)*7;
                        String stuer1 = Double.toString(stuer);
                        buttonMehr.setText(stuer1);
                        summe = stuer+netto;
                        String summe1 = Double.toString(summe);
                        buttonBrutto.setText(summe1);
                    }
                     summe = netto+stuer;
                    String summe1 = Double.toString(summe);
                    buttonBrutto.setText(summe1);
                    if (checkBox2Kindersitz.isSelected()){                          //Kindersitz
                        double kindersitz = summe+1;
                        String kinder = Double.toString(kindersitz);
                        buttonBrutto.setText(kinder);
                    } else if (checkBox1Nachtfahrt.isSelected()) {                 //Nachtfahrt
                        double nachtfahrt = (Double.parseDouble(textField1Km.getText())*0.05);
                        double nachfahrt1 = nachtfahrt+summe;
                        String nachfahrt2 = Double.toString(nachfahrt1);
                        buttonBrutto.setText(nachfahrt2);

                    } else if (checkBox3Bar.isSelected()) {                                    //Bar
                        double bar = Double.parseDouble(textFieldFahrgäste.getText())*15;
                        double summebar =bar+summe;
                        String summebar1 = Double.toString(summebar);
                        buttonBrutto.setText(summebar1);
                        double brutto = (summebar/100)*19;
                        String brutto1 =Double.toString(brutto);
                        buttonMehr.setText(brutto1);
                        double nettobar = summebar-brutto;
                        String nettobar1 = Double.toString(nettobar);
                        ButtonNetto.setText(nettobar1);


                        
                    }

                }else if (comboBox1.getSelectedItem().equals("Großraumtaxi")){                   //Großraumtaaxi
                    double netto = (Double.parseDouble(textField1Km.getText())*1)+3.90;
                    String netto1 = Double.toString(netto);
                    ButtonNetto.setText(netto1);

                    double x =Double.parseDouble(textField1Km.getText());                        //km
                    double stuer=0.0;
                    double summe=0.0;
                    if (x>=50){                                                                 //mehr als 50km
                        stuer = (netto/100)*19;
                        String stuer1 = Double.toString(stuer);
                        buttonMehr.setText(stuer1);
                        summe = stuer+netto;
                        String summe1 = Double.toString(summe);
                        buttonBrutto.setText(summe1);
                    }else if (x<50){                                                            //unter50km
                        stuer = (netto/100)*7;
                        String stuer1 = Double.toString(stuer);
                        buttonMehr.setText(stuer1);
                        summe = stuer+netto;
                        String summe1 = Double.toString(summe);
                        buttonBrutto.setText(summe1);
                    }

                     summe = netto+stuer;
                    String summe1 = Double.toString(summe);
                    buttonBrutto.setText(summe1);
                    
                    if (checkBox2Kindersitz.isSelected()){
                        double kindrsitz = summe+1;
                        String kinder = Double.toString(kindrsitz);
                        buttonBrutto.setText(kinder);
                    } else if (checkBox3Bar.isSelected()) {
                        double bar = Double.parseDouble(textFieldFahrgäste.getText())*15;
                        String bar1 = Double.toString(bar);
                        buttonBrutto.setText(bar1);
                        
                    } else if (checkBox1Nachtfahrt.isSelected()) {
                        double nachtfahrt = Double.parseDouble(textField1Km.getText())*0.1;
                        double nachfahrt1 =nachtfahrt+summe;
                        String nachfahrt2 = Double.toString(nachfahrt1);
                        buttonBrutto.setText(nachfahrt2);

                    }
                }




            }
        });
        ButtonDruken.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ButtonNeu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldFahrgäste.setText("");
                textField1Km.setText("");
                buttonBrutto.setText("");
                buttonMehr.setText("");
                ButtonNetto.setText("");

            }
        });
        ButtonEnde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonMehr.setText("0");
                buttonBrutto.setText("0");
                ButtonNetto.setText("0");

            }
        });

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        textFieldFahrgäste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
