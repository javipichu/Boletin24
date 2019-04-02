package boletin24;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author finfanterodal
 */
public class GUI {

    JFrame marco;
    Panel1 p1 = new Panel1();
    Panel2 p2 = new Panel2();
    JPanel panel3 = new JPanel();

    public void crearGUI() {
        BoxLayout bl = new BoxLayout(panel3, BoxLayout.Y_AXIS);
        panel3.setLayout(bl);
        p1.disPanel1();
        p2.disPanel2();

        //Instanciamos
        marco = new JFrame("marco");

        //Creamos características de los compoñentes
        marco.setBackground(Color.yellow);
        panel3.setSize(350, 550);
        marco.setSize(400, 600);
        //
        panel3.add(p1.panel);
        panel3.add(p2.panel2);

        p1.boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p1.liTexto1.setText("");
                p1.liTexto2.setText("");
            }
        });

        //
        p2.boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = p1.liTexto1.getText();
                String curso = (String) p2.liTexto1.getSelectedValue();
                p2.tarea.append(nome + "-" + curso + "\n");

            }
        });

        marco.add(this.panel3);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
