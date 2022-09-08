package Interface;

import javax.swing.*;
import java.awt.*;

public class JogoMenu extends JFrame {

    private JPanel Menu;
    private JLabel Title;
    private JButton iniciarButton;
    private JButton tipoButton;
    private JButton dificuldadeButton;
    private JButton sairButton;

    public JogoMenu(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Menu);

    }

    public static void main(String[] args) {
        JFrame frame = new JogoMenu("menuPuzzle");
        frame.setSize(new Dimension(500,500));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);


        frame.setVisible(true);


    }

}
