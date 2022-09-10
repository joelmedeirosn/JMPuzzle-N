package Interface;

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

        iniciarButton.addActionListener(this);
        tipoButton.addActionListener(this);
        dificuldadeButton.addActionListener(this);
        sairButton.addActionListener(this);


    }

    public static void main(String[] args) {
        JFrame frame = new JogoMenu();
        frame.setSize(new Dimension(500,500));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==iniciarButton){
            Jogo iniciar = new Jogo();
            setContentPane(iniciar);
            iniciar.revalidate();
        }
        if(e.getSource()==tipoButton){
            System.out.println("bb");
        }
        if(e.getSource()==dificuldadeButton){

        }
        if(e.getSource()==sairButton){
            System.exit(0);
        }
    }
}
