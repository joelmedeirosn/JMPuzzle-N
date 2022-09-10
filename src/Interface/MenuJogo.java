package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuJogo extends JFrame implements ActionListener {

    public MenuJogo() {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("AMogus");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuJogo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
