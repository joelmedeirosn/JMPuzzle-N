package Interface.Bot;

import Interface.JogoUsuario;
import PuzzleN.Puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Jogo extends JFrame implements ActionListener {

    private JPanel JogoPanel;
    private JButton Reset;
    private JLabel nome;
    private JPanel grid;
    private JButton[][] botao;
    private int nivel;
    private int[] array;
    private JogoUsuario usuario;


    public Jogo(String playerName,int nivel,String tipo,JogoUsuario usuario){

        this.usuario = usuario;
        this.nivel = nivel;
        nome.setText(playerName);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JogoPanel);
        setSize(new Dimension(700, 700));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);


        if(Objects.equals(tipo, "char")){addButtonChar();}
        else if(Objects.equals(tipo, "num")){addButton();}
        else if(Objects.equals(tipo, "imagem")){addButtonImg();}
        Reset.addActionListener(this);

        System.out.println(tipo);


    }

    public void addButton(){

        this.grid = new JPanel(new GridLayout(nivel,nivel,5,5));
        grid.setBackground(new Color(4, 30, 66));
        grid.setPreferredSize(new Dimension(500,500));

        Reset.setPreferredSize(new Dimension(100,50));


        botao = new JButton[nivel][nivel];
        Puzzle a = new Puzzle();
        array = a.NiveldoPuzzle(nivel);

        int k = 0;

        for(int i = 0; i<nivel;i++){
            for(int j = 0; j<nivel; j++) {

                if(String.valueOf(array[k]).equals("0")){
                    botao[i][j] = new JButton();
                    botao[i][j].setBackground(new Color(4,30,66));
                    botao[i][j].setFont(new Font("",Font.BOLD,0));
                    botao[i][j].setText(String.valueOf(array[k]));

                }
                else{
                    botao[i][j] = new JButton();
                    botao[i][j].setBackground(new Color(134,0,56));
                    botao[i][j].setForeground(new Color(253,187,48));
                    botao[i][j].setFont(new Font("Sans-serif",Font.BOLD,50));
                    botao[i][j].setText(String.valueOf(array[k]));
                }
                k++;
                grid.add(botao[i][j]);
            }
        }
        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(10,60,0,-60);
        c.weightx = 2;
        c.weighty = 2;
        c.gridx =0;
        c.gridy =0;
        JogoPanel.add(grid,c);

        c.insets = new Insets(20,10,0,0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx =0;
        c.gridy =2;
        JogoPanel.add(nome,c);

        c.insets = new Insets(20,0,0,10);
        c.fill = GridBagConstraints.NONE;
        c.gridx =2;
        c.gridy =2;
        JogoPanel.add(Reset,c);

    }

    public void addButtonChar(){
        this.grid = new JPanel(new GridLayout(nivel,nivel,5,5));
        grid.setBackground(new Color(4, 30, 66));
        grid.setPreferredSize(new Dimension(500,500));

        Reset.setPreferredSize(new Dimension(100,50));


        botao = new JButton[nivel][nivel];
        Puzzle a = new Puzzle();
        array = a.NiveldoPuzzle(nivel);

        int k = 0;

        for(int i = 0; i<nivel;i++){
            for(int j = 0; j<nivel; j++) {

                if(String.valueOf(array[k]).equals("0")){
                    botao[i][j] = new JButton();
                    botao[i][j].setBackground(new Color(4,30,66));
                    botao[i][j].setFont(new Font("",Font.BOLD,0));

                    char c=(char)array[k];
                    botao[i][j].setText(String.valueOf(c));

                }
                else{
                    botao[i][j] = new JButton();
                    botao[i][j].setBackground(new Color(134,0,56));
                    botao[i][j].setForeground(new Color(253,187,48));
                    botao[i][j].setFont(new Font("Sans-serif",Font.BOLD,50));

                    int A = array[k]+64;
                    char c=(char)A;

                    botao[i][j].setText(String.valueOf(c));
                }
                k++;
                grid.add(botao[i][j]);
            }
        }
        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(10,60,0,-60);
        c.weightx = 2;
        c.weighty = 2;
        c.gridx =0;
        c.gridy =0;
        JogoPanel.add(grid,c);

        c.insets = new Insets(20,10,0,0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx =0;
        c.gridy =2;
        JogoPanel.add(nome,c);

        c.insets = new Insets(20,0,0,10);
        c.fill = GridBagConstraints.NONE;
        c.gridx =2;
        c.gridy =2;
        JogoPanel.add(Reset,c);
    }

    public void addButtonImg(){
        this.grid = new JPanel(new GridLayout(nivel,nivel,5,5));
        grid.setBackground(new Color(4, 30, 66));
        grid.setPreferredSize(new Dimension(500,500));

        Reset.setPreferredSize(new Dimension(100,50));

        botao = new JButton[nivel][nivel];
        Puzzle a = new Puzzle();
        array = a.NiveldoPuzzle(nivel);

        int k = 0;

        for(int i = 0; i<nivel;i++){
            for(int j = 0; j<nivel; j++) {

                if(String.valueOf(array[k]).equals("0")){
                    botao[i][j] = new JButton();
                    botao[i][j].setBackground(new Color(4,30,66));
                    botao[i][j].setForeground(new Color(255, 255, 255, 255));
                    botao[i][j].setFont(new Font("",Font.BOLD,0));

                    botao[i][j].setHorizontalTextPosition(SwingConstants.CENTER);
                    botao[i][j].setText(String.valueOf(array[k]));

                }
                else{
                    botao[i][j] = new JButton();
                    botao[i][j].setBackground(new Color(134,0,56));
                    botao[i][j].setForeground(new Color(255, 255, 255, 255));
                    botao[i][j].setFont(new Font("",Font.BOLD,50));

                    botao[i][j].setHorizontalTextPosition(SwingConstants.CENTER);
                    botao[i][j].setText(String.valueOf(array[k]));

                    if (usuario.getNivel()==2) {
                        botao[i][j].setIcon(new ImageIcon(getClass().getResource("/bobesponja2/" + (botao[i][j].getText()) + ".png")));
                    }
                    else if(usuario.getNivel()==3) {
                        botao[i][j].setIcon(new ImageIcon(getClass().getResource("/bobesponja9/" + (botao[i][j].getText()) + ".png")));
                    }
                    else if(usuario.getNivel()==4){
                        botao[i][j].setIcon(new ImageIcon(getClass().getResource("/bobesponja16/" + (botao[i][j].getText()) + ".png")));
                    }

                }
                k++;
                grid.add(botao[i][j]);
            }
        }
        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(10,60,0,-60);
        c.weightx = 2;
        c.weighty = 2;
        c.gridx =0;
        c.gridy =0;
        JogoPanel.add(grid,c);

        c.insets = new Insets(20,10,0,0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx =0;
        c.gridy =2;
        JogoPanel.add(nome,c);

        c.insets = new Insets(20,0,0,10);
        c.fill = GridBagConstraints.NONE;
        c.gridx =2;
        c.gridy =2;
        JogoPanel.add(Reset,c);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Reset){
            setVisible(false);
            Jogo iniciar = new Jogo(usuario.getNomeUsuario(),usuario.getNivel(),usuario.getTipo(),usuario);

        }
    }

}


