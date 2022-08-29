package Interface;

import javax.swing.*;
import java.awt.*;

public class JogoTipo extends JFrame{
    private JButton confirmarButton;
    private JPanel Tipo;
    private JButton caracteresButton;
    private JButton númerosButton;
    private JButton imagensButton;
    private JLabel Title;

    public JogoTipo(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Tipo);

    }
    public static void main(String[] args) {
        JFrame frame = new JogoTipo("tipoPuzzle");
        frame.setSize(new Dimension(500,500));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);


        frame.setVisible(true);
    }
}
