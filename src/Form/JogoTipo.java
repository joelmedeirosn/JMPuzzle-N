package Form;

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
    private JButton voltar;
    private JogoUsuario usuario;


    public JogoTipo(JogoUsuario usuario){
        this.usuario = usuario;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Tipo);
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        numerosButton.addActionListener(this);
        imagensButton.addActionListener(this);
        caracteresButton.addActionListener(this);
        voltar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==numerosButton){
            setVisible(false);
            usuario.setTipo("num");
            new JogoDificuldade(usuario);

        }
        if(e.getSource()==imagensButton){
            setVisible(false);
            usuario.setTipo("imagem");
            new JogoDificuldade(usuario);

        }
        if(e.getSource()==caracteresButton){
            setVisible(false);
            usuario.setTipo("char");
            new JogoDificuldade(usuario);

        }
        if(e.getSource()==voltar){
            setVisible(false);
            JogoMenu menu = new JogoMenu();
        }
    }
}
