package PuzzleN;

import Form.JogoUsuario;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Puzzle {

    private int tamanhoJogo;
    private int numCelulas;
    private JButton[][] botoes;

    public Puzzle(int tamanhoJogo){this.tamanhoJogo = tamanhoJogo;}
    public int[] NiveldoPuzzle() {

        setNumCelulas(tamanhoJogo * tamanhoJogo - 1);
        int[] celulas = new int[tamanhoJogo * tamanhoJogo];
        for (int i = 0; i < tamanhoJogo * tamanhoJogo; i++) {
            celulas[i] = i;
        }
        return Randomizar(celulas);

    }
    public int[] Randomizar(int[] celulas) {
        Random random = new Random();

        for (int i = 0; i < celulas.length; i++) {
            int rand = random.nextInt(celulas.length);
            int prov = celulas[i];
            celulas[i] = celulas[rand];
            celulas[rand] = prov;
        }
        System.out.print(Arrays.toString(celulas));
        return celulas;

    }

    public int getInvCount(int[] celulas) {

        int inv_count = 0;
        for (int i = 0; i < celulas.length; i++)
            for (int j = i + 1; j < celulas.length; j++)
                if (celulas[i] > 0 &&
                        celulas[j] > 0 && celulas[i] > celulas[j])
                    inv_count++;
        return inv_count;
    }

    public boolean isSolvable(int[] celulas) {
        int invCount = getInvCount(celulas);
        return (invCount % 2 == 0);
    }


    public int[][] Gabarito() {
        int[][] array = new int[this.tamanhoJogo][this.tamanhoJogo];
        for (int i = 0; i < this.tamanhoJogo; i++) {
            for (int j = 0; j < this.tamanhoJogo; j++) {
                array[i][j] = j + (i * tamanhoJogo) + 1;
            }
        }
        array[this.tamanhoJogo - 1][this.tamanhoJogo - 1] = 0;
        return array;
    }
    public boolean Resolucao(JButton[][] botoes) {
        int[][] array = Gabarito();
        for (int i = 0; i < this.tamanhoJogo; i++) {
            for (int j = 0; j < this.tamanhoJogo; j++) {
                if (!String.valueOf(array[i][j]).equals(botoes[i][j].getText())) {
                    return false;
                }
            }
        }
        return true;
    }
    public char trocarIntPorChar(int i) {
        return i > 0 && i < 27 ? (char) (i + 'A' - 1) : null;
    }

    public char[][] GabaritoChar() {
        int[][] respostaNumero = Gabarito();
        char[][] array = new char[this.tamanhoJogo][this.tamanhoJogo];
        for (int i = 0; i < this.tamanhoJogo; i++) {
            for (int j = 0; j < this.tamanhoJogo; j++) {
                if (respostaNumero[i][j] == 0) {
                    array[i][j] = '0';
                } else {
                    array[i][j] = trocarIntPorChar(respostaNumero[i][j]);
                }
            }
        }
        return array;
    }

    public boolean ResolucaoChar(JButton[][] botoes) {
        char[][] array = GabaritoChar();
        for (int i = 0; i < this.tamanhoJogo; i++) {
            for (int j = 0; j < this.tamanhoJogo; j++) {
                if (!String.valueOf(array[i][j]).equals(botoes[i][j].getText())) {
                    return false;
                }
            }
        }
        return true;
    }

    public void setNumCelulas(int numCelulas) {this.numCelulas = numCelulas;}
    public int getNumCelulas() {
        return (numCelulas);
    }


}
