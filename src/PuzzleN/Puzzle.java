package PuzzleN;

import java.util.Arrays;
import java.util.Random;

public class Puzzle {

    private int tamanhoJogo;
    private int numCelulas;
    private int branco;



    public int[] NiveldoPuzzle(int tamanhoJogo) {

        setTamanhoJogo(tamanhoJogo);
        setNumCelulas(getTamanhoJogo() * getTamanhoJogo() - 1);
        int [] celulas= new int [getNumCelulas()+1];
        for (int i=0; i<getNumCelulas()+1;i++){
            celulas[i]=i;
        }
        return Randomizar(getNumCelulas(), celulas);

        }


    public int[] Randomizar(int numCelulas, int[] celulas) {
        setNumCelulas(numCelulas);
        Random random = new Random();


        for (int i = 0; i < celulas.length; i++) {
            int rand = random.nextInt(celulas.length);
            int prov= celulas[i];
            celulas[i] = celulas[rand];
            celulas[rand]=prov;
        }
        Posicao(celulas);
        System.out.print(Arrays.toString(celulas));
        System.out.println(celulas.length);
        return celulas;

    }
    public int getInvCount(int[] celulas)
    {

        int inv_count = 0;
        for (int i = 0; i < celulas.length ; i++)
            for (int j = i + 1; j < celulas.length; j++)

                // Value 0 is used for empty space
                if (celulas[i] > 0 &&
                        celulas[j] > 0 && celulas[i] > celulas[j])
                    inv_count++;
        return inv_count;
    }

    // This function returns true
// if given 8 puzzle is solvable.
    public boolean isSolvable(int[] celulas)
    {
        // Count inversions in given 8 puzzle
        int invCount = getInvCount(celulas);
        // return true if inversion count is even.
        return (invCount % 2 == 0);
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


        }
