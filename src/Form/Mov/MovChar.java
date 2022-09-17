package Form.Mov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MovChar extends Mov{

    private JButton[][] botao;
    private int posicaoI;
    private int posicaoJ;

    public MovChar(JButton[][] botao){
        this.botao=botao;
    }

    public void setPosicaoI(int posicaoI){this.posicaoI=posicaoI;}

    public void setPosicaoJ(int posicaoJ){
        this.posicaoJ=posicaoJ;
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            for(int i=0; i<this.botao.length;i++){
                for(int j=0; j<this.botao.length;j++){
                    if (e.getSource()==this.botao[i][j]){
                        if(((i+1 == posicaoI && j == posicaoJ) || (i-1 == posicaoI && j == posicaoJ) || (i == posicaoI && j+1 == posicaoJ || (i == posicaoI && j-1 == posicaoJ)))){
                            botao[posicaoI][posicaoJ].setBackground(new Color(134,0,56));
                            botao[posicaoI][posicaoJ].setForeground(new Color(253,187,48));
                            botao[posicaoI][posicaoJ].setFont(new Font("Sans-serif",Font.BOLD,50));
                            botao[posicaoI][posicaoJ].setText(botao[i][j].getText());

                            botao[i][j].setBackground(new Color(4,30,66));
                            botao[i][j].setFont(new Font("",Font.BOLD,0));
                            botao[i][j].setText(" ");

                            setPosicaoI(i);
                            setPosicaoJ(j);
                        }
                    }
                }
            }
        }
    }

