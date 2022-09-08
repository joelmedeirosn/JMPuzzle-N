package Interface;

import javax.swing.*;
import java.awt.*;

public class JogoDificuldade extends JFrame {
    private JPanel Dificuldade;
    private JButton a3x3Button;
    private JButton a4x4Button;
    private JButton confirmarButton;
    public JogoDificuldade(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Dificuldade);

    }

    public static void main(String[] args) {
        JFrame frame = new JogoDificuldade("dificuldadePuzzle");
        frame.setSize(new Dimension(500,500));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);


        frame.setVisible(true);


    }
}
