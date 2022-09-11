package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jogo extends JFrame implements ActionListener {

    private JPanel JogoPanel;
    private JButton Reset;
    private JLabel nome;


    public Jogo(String playerName){

        nome.setText(playerName);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JogoPanel);
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        Reset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Reset){
            setVisible(false);
            JogoMenu iniciar = new JogoMenu();

        }
    }
}


