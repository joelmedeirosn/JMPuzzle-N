package PuzzleN;

import Interface.Jogo;
import Interface.JogoMenu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Puzzle {

    private int tamanhoJogo;
    private int tamanhoCelula;
    private int numCelulas;
    private int branco;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String RESET = "\033[0m";


    public void NiveldoPuzzle(int tamanhoJogo) {

            setTamanhoJogo(tamanhoJogo);
            setNumCelulas(getTamanhoJogo() * getTamanhoJogo() - 1);
            int [] celulas= new int [getNumCelulas()+1];
            for (int i=0; i<getNumCelulas()+1;i++){
                celulas[i]=i;
            }
            Randomizar(getNumCelulas(), celulas);

        }



    public void Randomizar(int numCelulas, int[] celulas) {
        setNumCelulas(numCelulas);
        Random random = new Random();
        setBranco(0);

        for (int i = 0; i < celulas.length; i++) {
            int rand = random.nextInt(celulas.length);
            int prov= celulas[i];
            celulas[i] = celulas[rand];
            celulas[rand]=prov;
        }
        Posicao(celulas);
        System.out.print(Arrays.toString(celulas));

    }
    public int[] gabarito(int x){
        int [] celulasOrdem = new int[x*x];
        for (int i = 1; i < x*x; i++){
            celulasOrdem[i] = i;
        }
        return celulasOrdem;
    }

    public void Posicao( int[] celulas) {
        int[] g;
        g = gabarito(tamanhoJogo);
        StringBuilder sb = new StringBuilder();

        if (tamanhoJogo == 3) {
            for (int i = 1; i < 9; i++) {
                if (celulas[i-1] == g[i]) {
                    System.out.println("!"+i+"!");
                    }
            }
            if (celulas[8]==0){
                System.out.println("!"+0+"!");
            }
        } else if (tamanhoJogo == 4) {
            for (int i = 1; i < 16; i++) {
                if (celulas[i-1] == g[i]) {
                    System.out.println("!"+i+"!");}
            }
            if (celulas[15]==0){
                System.out.println("!"+0+"!");
            }
        }
    }
            public void setTamanhoJogo ( int tamanhoJogo){
                this.tamanhoJogo = tamanhoJogo;
            }
            public int getTamanhoJogo () {
                return (tamanhoJogo);
            }
            public void setNumCelulas ( int numCelulas){
                this.numCelulas = numCelulas;
            }
            public int getNumCelulas () {
                return (numCelulas);
            }
            public void setBranco ( int branco){
                this.branco = branco;
            }


        }
