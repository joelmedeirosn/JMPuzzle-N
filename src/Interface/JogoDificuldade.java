package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDificuldade extends JFrame implements ActionListener{
    private JPanel Dificuldade;
    private JButton a3x3Button;
    private JButton a4x4Button;
    private JButton voltar;
    private JButton confirmarButton;
    private JogoUsuario usuario;

    public JogoDificuldade(JogoUsuario usuario) {

        this.usuario = usuario;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Dificuldade);
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);


        a4x4Button.addActionListener(this);
        a3x3Button.addActionListener(this);
        voltar.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==a3x3Button){
            setVisible(false);
            usuario.setNivel(3);
            Jogo iniciar = new Jogo(usuario.getNomeUsuario(),usuario.getNivel(),usuario.getTipo());


        }
        else if(e.getSource()==a4x4Button){
            setVisible(false);
            usuario.setNivel(4);
            Jogo iniciar = new Jogo(usuario.getNomeUsuario(),usuario.getNivel(),usuario.getTipo());

        }

        else if(e.getSource()==voltar){
            setVisible(false);
            JogoTipo tipo = new JogoTipo(usuario);
        }


    }
}