package Form.Bot;

import Form.JogoUsuario;
import PuzzleN.Puzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Objects;

public abstract class Bot extends JFrame implements ActionListener {
    private JPanel JogoPanel;
    private JButton Reset;
    private JLabel nome;
    private JPanel grid;
    private JButton[][] botao;
    private int nivel;
    private String playerName;
    private int[] array;
    private String tipo;
    private JogoUsuario usuario;


    public Bot(String playerName,int nivel,String tipo,JogoUsuario usuario) {
        this.playerName = playerName;
        this.nivel = nivel;
        this.tipo = tipo;
        this.usuario = usuario;


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(JogoPanel);
        setSize(new Dimension(700, 700));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        if(Objects.equals(tipo, "char")){;}
        else if(Objects.equals(tipo, "num")){addButton();}
        else if(Objects.equals(tipo, "imagem")){;}
        Reset.addActionListener(this);


    }


    public abstract void addButton();

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Reset){
            setVisible(false);
            Jogo iniciar = new Jogo(usuario.getNomeUsuario(),usuario.getNivel(),usuario.getTipo(),usuario);
        }
    }

    public void tamanhoGrid(){
        grid = new JPanel(new GridLayout(nivel,nivel,5,5));
        grid.setBackground(new Color(4, 30, 66));
        grid.setPreferredSize(new Dimension(500,500));
        Reset.setPreferredSize(new Dimension(100,50));

        botao = new JButton[nivel][nivel];
        Puzzle a = new Puzzle(nivel);
        array = a.NiveldoPuzzle();
        System.out.println(Arrays.deepToString(a.Gabarito()));

        while(!a.isSolvable(array)){
            array = a.NiveldoPuzzle();
        }
    }


    public int getNivel() {return nivel;}
    public void setNivel(int nivel) {this.nivel = nivel;}

    public JLabel getNome() {return nome;}
    public void setNome(JLabel nome) {this.nome = nome;}

    public JButton[][] getBotao() {return botao;}
    public void setBotao(JButton[][] botao) {this.botao = botao;}

    public JogoUsuario getUsuario() {return usuario;}
    public void setUsuario(JogoUsuario usuario) {this.usuario = usuario;}

    public JButton getReset() {return Reset;}
    public void setReset(JButton reset) {Reset = reset;}

    public JPanel getGrid() {return grid;}
    public void setGrid(JPanel grid) {this.grid = grid;}

    public JPanel getJogoPanel() {return JogoPanel;}
    public void setJogoPanel(JPanel jogoPanel) {JogoPanel = jogoPanel;}

    public int[] getArray() {return array;}
    public void setArray(int[] array){this.array = array;}


}
