package Start;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormStart extends JFrame {
    private JLabel JLabelVorname;
    private JTextField textFieldVorname;
    private JLabel JLabelNachname;
    private JTextField textFieldNachname;
    private JButton buttonTextfeld;
    private JButton buttonMessage;
    private JPanel panelMain;
    private JTextField textFieldNachricht;

    public FormStart (){

        this.setTitle("Startbeispiel");
        this.setLocationByPlatform(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelMain);
        this.pack();
        buttonTextfeld.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonTextfeldActionPerformed(e);
            }
        });
        buttonMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonMessageActionPerformed (e);
            }
        });
    }

    private void buttonMessageActionPerformed(ActionEvent e) {
        String anrede = "Moin " + textFieldVorname.getText() + " " + textFieldNachname.getText();
        JOptionPane.showMessageDialog(this, anrede, this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    }

    private void buttonTextfeldActionPerformed(ActionEvent e) {
        String anrede = "Moin " + textFieldVorname.getText() + " " + textFieldNachname.getText();
        textFieldNachricht.setText(anrede);
    }
}
