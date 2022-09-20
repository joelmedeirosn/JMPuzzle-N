package Form.Bot;

import Form.JogoUsuario;
import Form.Mov.MovNum;
import PuzzleN.Puzzle;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class BotNum extends Bot {


    public BotNum(String playerName, int nivel, String tipo, JogoUsuario usuario) {
        super(playerName, nivel, tipo, usuario);
    }

    @Override
    public void addButton(){

        super.tamanhoGrid();

        int k = 0;
        MovNum movNum = new MovNum(getBotao(),getUsuario(),getJogoPanel());

        for(int i = 0; i<getNivel();i++){
            for(int j = 0; j<getNivel(); j++) {

                if(String.valueOf(getArray()[k]).equals("0")){
                    getBotao()[i][j] = new JButton();
                    getBotao()[i][j].setBackground(new Color(4,30,66));
                    movNum.setPosicaoI(i);
                    movNum.setPosicaoJ(j);
                    getBotao()[i][j].setFont(new Font("",Font.BOLD,0));
                    getBotao()[i][j].setText(String.valueOf(getArray()[k]));
                    getBotao()[i][j].addActionListener(movNum);


                }
                else{
                    getBotao()[i][j] = new JButton();
                    getBotao()[i][j].setBackground(new Color(134,0,56));
                    getBotao()[i][j].setForeground(new Color(253,187,48));
                    getBotao()[i][j].setFont(new Font("Sans-serif",Font.BOLD,50));
                    getBotao()[i][j].setText(String.valueOf(getArray()[k]));
                    getBotao()[i][j].addActionListener(movNum);

                }
                k++;
                getGrid().add(getBotao()[i][j]);
            }
        }
        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(10,60,0,-60);
        c.weightx = 2;
        c.weighty = 2;
        c.gridx =0;
        c.gridy =0;
        getJogoPanel().add(getGrid(),c);

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
