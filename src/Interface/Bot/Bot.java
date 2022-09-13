package Interface.Bot;

import Interface.JogoUsuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Bot extends JPanel implements ActionListener {
    private JPanel JogoPanel;
    private JButton Reset;
    private JLabel nome;
    private JPanel grid;
    private JButton[][] botao;
    private int nivel;
    private int[] array;
    private JogoUsuario usuario;

    public abstract void addButton();

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Reset){
            setVisible(false);
            Jogo iniciar = new Jogo(usuario.getNomeUsuario(),usuario.getNivel(),usuario.getTipo(),usuario);
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

    public int[] getArray() {return array;}
    public void setArray(int[] array) {this.array = array;}

    public JButton getReset() {return Reset;}
    public void setReset(JButton reset) {Reset = reset;}

    public JPanel getGrid() {return grid;}
    public void setGrid(JPanel grid) {this.grid = grid;}

    public JPanel getJogoPanel() {return JogoPanel;}
    public void setJogoPanel(JPanel jogoPanel) {JogoPanel = jogoPanel;}
}
