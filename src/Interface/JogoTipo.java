package Interface;

import PuzzleN.Puzzle;
import PuzzleN.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoTipo extends JFrame implements ActionListener {
    private JButton confirmarButton;
    private JPanel Tipo;
    private JButton caracteresButton;
    private JButton numerosButton;
    private JButton imagensButton;
    private JLabel Title;


    public JogoTipo(){


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Tipo);
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        confirmarButton.addActionListener(this);
        numerosButton.addActionListener(this);
        imagensButton.addActionListener(this);
        caracteresButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==confirmarButton){
            setVisible(false);
            JogoMenu iniciar = new JogoMenu();
        }
        if(e.getSource()==numerosButton){

        }
        if(e.getSource()==imagensButton){

        }
        if(e.getSource()==caracteresButton){

        }
    }
}
