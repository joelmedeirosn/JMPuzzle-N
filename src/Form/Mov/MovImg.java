package Form.Mov;

import Form.JogoUsuario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MovImg extends Mov{
    private JButton[][] botao;
    private int posicaoI;
    private int posicaoJ;

    public MovImg(JButton[][] botao){this.botao=botao;}
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

                        JogoUsuario usuario = new JogoUsuario();
                        if (usuario.getNivel()==2) {
                            botao[posicaoI][posicaoJ].setBackground(new Color(134,0,56));
                            botao[posicaoI][posicaoJ].setForeground(new Color(255, 255, 255, 255));
                            botao[posicaoI][posicaoJ].setFont(new Font("Sans-serif",Font.BOLD,50));
                            botao[posicaoI][posicaoJ].setIcon(new ImageIcon(getClass().getResource("/bobesponja2/" + (botao[i][j].getText()) + ".png")));
                        }
                        else if(usuario.getNivel()==3) {
                            botao[posicaoI][posicaoJ].setBackground(new Color(134,0,56));
                            botao[posicaoI][posicaoJ].setForeground(new Color(255, 255, 255, 255));
                            botao[posicaoI][posicaoJ].setFont(new Font("Sans-serif",Font.BOLD,50));
                            botao[posicaoI][posicaoJ].setIcon(new ImageIcon(getClass().getResource("/bobesponja9/" + (botao[i][j].getText()) + ".png")));
                        }
                        else if(usuario.getNivel()==4){
                            botao[posicaoI][posicaoJ].setBackground(new Color(134,0,56));
                            botao[posicaoI][posicaoJ].setForeground(new Color(255, 255, 255, 255));
                            botao[posicaoI][posicaoJ].setFont(new Font("Sans-serif",Font.BOLD,50));
                            botao[posicaoI][posicaoJ].setIcon(new ImageIcon(getClass().getResource("/bobesponja16/" + (botao[i][j].getText()) + ".png")));
                        }

                        botao[i][j].setBackground(new Color(4,30,66));
                        botao[i][j].setForeground(new Color(255, 255, 255, 255));
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
