package Form.Mov;

import Form.JogoMenu;
import Form.JogoUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Mov extends JFrame implements ActionListener {

    private JButton menu;
    public void JogoGanho(JPanel Panel){

        setContentPane(Panel);

        setSize(new Dimension(700, 700));
        setLocationRelativeTo(null);
        setResizable(false);
        Panel.setLayout(new BoxLayout(Panel, BoxLayout.PAGE_AXIS));
        Panel.setBackground(new Color(98, 13, 114));

        JLabel label = new JLabel("Parabéns, você ganhou!!");
        label.setForeground(new Color(30, 83, 138));
        label.setFont(new Font("",1,50));
        label.setAlignmentX(CENTER_ALIGNMENT);
        Panel.add(label);

        menu = new JButton("Menu");
        menu.setBackground(new Color(30, 83, 138));
        menu.setMaximumSize(new Dimension(200,50));
        menu.setFont(new Font("",1,25));
        menu.setAlignmentX(CENTER_ALIGNMENT);

        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new JogoMenu();
            }
        });

        Panel.add(Box.createRigidArea(new Dimension(0,500)));

        Panel.add(menu);


        setVisible(true);
    }
}
