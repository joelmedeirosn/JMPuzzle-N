package Interface;

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

    public JogoMenu(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Menu);
        setSize(new Dimension(500,500));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        iniciarButton.addActionListener(this);
        tipoButton.addActionListener(this);
        dificuldadeButton.addActionListener(this);
        sairButton.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==iniciarButton){
            setVisible(false);
            String playerName = JOptionPane.showInputDialog(null,"Digite seu nome");
            Usuario usuario = new Usuario();
            usuario.setNomeUsuario(playerName);

            Jogo iniciar = new Jogo(playerName);
        }
        if(e.getSource()==tipoButton){
            setVisible(false);
            JogoTipo iniciar = new JogoTipo();
        }
        if(e.getSource()==dificuldadeButton){
            setVisible(false);
            JogoDificuldade iniciar = new JogoDificuldade();
        }
        if(e.getSource()==sairButton){
            System.exit(0);
        }
    }
}
