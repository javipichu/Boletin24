package boletin24;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author jalvarezotero
 */
public class Panel1 {

    //Declaramos
    JPanel panel;
    JButton boton1, boton2;
    JLabel etiqueta1, etiqueta2;
    JTextField liTexto1;
    JPasswordField liTexto2;

    public void disPanel1() {
        //Instanciamos
        this.panel = new JPanel();
        this.boton1 = new JButton();
        this.boton2 = new JButton();
        this.etiqueta1 = new JLabel();
        this.etiqueta2 = new JLabel();
        this.liTexto1 = new JTextField(20);
        this.liTexto2 = new JPasswordField(20);
        //Características

        etiqueta1.setText("Nome");
        etiqueta1.setBounds(50, 100, 100, 40);
        etiqueta2.setText("Password");
        etiqueta2.setBounds(50, 150, 100, 40);

        boton1.setBounds(200, 250, 100, 20);
        boton1.setText("PREMER");
        boton2.setBounds(50, 250, 100, 20);
        boton2.setText("LIMPAR");

        liTexto1.setBounds(200, 100, 100, 20);
        liTexto1.setText("");
        liTexto2.setBounds(200, 150, 100, 20);
        liTexto2.setText("");
        //Para que pdamos poner nuestra distribución
        panel.setLayout(null);
        //Aádimos los componentes
        panel.setSize(400, 300);
        panel.add(etiqueta1);
        panel.add(liTexto1);
        panel.add(etiqueta2);
        panel.add(liTexto2);
        panel.add(boton1);
        panel.add(boton2);

        //
    }

}
