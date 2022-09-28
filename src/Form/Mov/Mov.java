package Form.Mov;

import Form.JogoUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public abstract class Mov extends JFrame implements ActionListener {

    private JFrame frame;

    public void JogoGanho(JPanel Panel,JogoUsuario usuario){

        usuario.getPanel().setVisible(false);

        setContentPane(Panel);
        setSize(new Dimension(700, 700));
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(new Color(66, 4, 4));
        setVisible(true);
    }



}
