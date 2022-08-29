package Interface;

import javax.swing.*;
import java.awt.*;

public class Jogo extends JFrame{

    private JPanel Jogo;

    public Jogo(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Jogo);

    }

    public static void main(String[] args) {
        JFrame frame = new Jogo("jogoPuzzle");
        frame.setSize(new Dimension(500,500));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);


        frame.setVisible(true);


    }
}


