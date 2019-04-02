package boletin24;

import java.awt.Color;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author finfanterodal
 */
public class Panel2 {
    //Declaramos

    JPanel panel2;
    JButton boton1;
    JTextArea tarea;
    JList liTexto1;

    public void disPanel2() {
        //Instanciamos
        this.panel2 = new JPanel();
        String[] ele = {"DAM", "ASIR", "AUROIN"};
        this.liTexto1 = new JList(ele);
        this.tarea = new JTextArea("");
        this.boton1 = new JButton("BOTON");
        //Para que pdamos poner nuestra distribución
        panel2.setLayout(null);
        //Características
        panel2.setBackground(Color.lightGray);
        boton1.setBounds(140, 150, 100, 20);
        liTexto1.setBounds(20, 120, 100, 100);
        tarea.setBounds(250, 120, 100, 100);

        //Aádimos los componentes
        panel2.setSize(400, 300);
        panel2.add(boton1);
        panel2.add(tarea);
        panel2.add(liTexto1);

    }
}
