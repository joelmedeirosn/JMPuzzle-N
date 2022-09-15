package Form.Bot;

import Form.JogoUsuario;
import PuzzleN.Puzzle;

import javax.swing.*;
import java.awt.*;

public class BotNum extends Bot {

    private JButton[][] botao;

    private int[] array;

    public BotNum(JPanel jogoPanel, JButton reset, JLabel nome, JPanel grid, int nivel, JogoUsuario usuario) {
        super(jogoPanel, reset, nome, grid, nivel, usuario);
    }

    @Override
    public void addButton() {

        JPanel grid = getGrid();
        grid = new JPanel(new GridLayout(getNivel(),getNivel(),5,5));
        getGrid().setBackground(new Color(4, 30, 66));
        getGrid().setPreferredSize(new Dimension(500,500));

        getReset().setPreferredSize(new Dimension(100,50));


        botao = new JButton[getNivel()][getNivel()];
        Puzzle a = new Puzzle();
        array = a.NiveldoPuzzle(getNivel());

        int k = 0;

        for(int i = 0; i<getNivel();i++){
            for(int j = 0; j<getNivel(); j++) {

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
        getJogoPanel().add(grid,c);

        c.insets = new Insets(20,10,0,0);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx =0;
        c.gridy =2;
        getJogoPanel().add(getNome(),c);

        c.insets = new Insets(20,0,0,10);
        c.fill = GridBagConstraints.NONE;
        c.gridx =2;
        c.gridy =2;
        getJogoPanel().add(getReset(),c);

    }
}
