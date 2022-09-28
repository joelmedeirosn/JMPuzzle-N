package Form;

import Form.Exception.TamanhoNome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoMenu extends JFrame implements ActionListener {

    private JogoUsuario usuario;
    private JPanel Menu;
    private JLabel Title;
    private JButton iniciarButton;
    private JButton tipoButton;
    private JButton malucoButton;
    private JButton sairButton;
    private int nivel;
    private String tipo;

    public JogoMenu(){

        this.usuario = new JogoUsuario();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Menu);
        setSize(new Dimension(500,500));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        iniciarButton.addActionListener(this);
        malucoButton.addActionListener(this);
        sairButton.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==iniciarButton){
            try{
                usuario.setNomeUsuario(JOptionPane.showInputDialog("Digite seu nome"));
            } catch (TamanhoNome x) {
                JOptionPane.showMessageDialog(null,x.getMessage());
            }
        }
        if(e.getSource()==iniciarButton && usuario.getNomeUsuario()!=null){
            setVisible(false);
            new JogoTipo(usuario);
        }

        else if(e.getSource()==sairButton){
            System.exit(0);
        }
    }
}
