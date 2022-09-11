package Interface;

import PuzzleN.Puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDificuldade extends JFrame implements ActionListener{
    private JPanel Dificuldade;
    private JButton a3x3Button;
    private JButton a4x4Button;
    private JButton confirmarButton;

    public JogoDificuldade() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Dificuldade);
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        confirmarButton.addActionListener(this);
        a4x4Button.addActionListener(this);
        a3x3Button.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==confirmarButton){
            setVisible(false);
            JogoMenu iniciar = new JogoMenu();
            Puzzle jogo = new Puzzle();
            if(e.getSource()==a3x3Button){
                jogo.NiveldoPuzzle(3);
            }
            if(e.getSource()==a4x4Button){
                jogo.NiveldoPuzzle(4);
            }
        }
    }
}