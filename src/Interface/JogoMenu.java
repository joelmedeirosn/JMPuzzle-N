package Interface;

import PuzzleN.Puzzle;
import PuzzleN.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoMenu extends JFrame implements ActionListener {

    private JPanel Menu;
    private JLabel Title;
    private JButton iniciarButton;
    private JButton tipoButton;
    private JButton dificuldadeButton;
    private JButton sairButton;
    private int nivel;
    private String tipo;

    public JogoMenu(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Menu);
        setSize(new Dimension(500,500));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        iniciarButton.addActionListener(this);
        dificuldadeButton.addActionListener(this);
        sairButton.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==iniciarButton){
            setVisible(false);
            String playerName = JOptionPane.showInputDialog(null,"Digite seu nome");

            JogoUsuario usuario = new JogoUsuario();
            usuario.setNomeUsuario(playerName);

            JogoTipo tipo = new JogoTipo(usuario);


        }

        else if(e.getSource()==sairButton){
            System.exit(0);
        }
    }



}
