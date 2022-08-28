package PuzzleN;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Puzzle {

    private int tamanhoJogo;
    private int tamanhoCelula;
    private int numCelulas;
    private int branco;


    public int NiveldoPuzzle(int tamanhoJogo) {
        if (tamanhoJogo > 2 && tamanhoJogo < 5) {
            setTamanhoJogo(tamanhoJogo);
            setNumCelulas(getTamanhoJogo() * getTamanhoJogo() - 1);
            int [] celulas= new int [getNumCelulas()+1];
            for (int i=0; i<getNumCelulas()+1;i++){
                celulas[i]=i;
            }
            Randomizar(getNumCelulas(), celulas);
            return (getNumCelulas());
        } else {
            System.out.println("Esse nivel nao existe");
            return (0);
        }

    }

    public void Randomizar(int numCelulas,int celulas[]) {
        Set<Integer> numeros = new HashSet<>();
        setNumCelulas(numCelulas);
        Random random = new Random();
        setBranco(0);


        for (int i = 0; i < celulas.length; i++) {
            int rand = random.nextInt(celulas.length);
            int prov= celulas[i];
            celulas[i] = celulas[rand];
            celulas[rand]=prov;

        }

        System.out.print(Arrays.toString(celulas));

    }
    public int[] gabarito(int x){
        int [] celulasOrdem = new int[x*x];
        for (int i = 0; i < x*x; i++){
            celulasOrdem[i] = i+1;
        }
        return celulasOrdem;
    }

    /*public boolean Posicao() {
        boolean resposta = false;
        int[] g = new int[tamanhoJogo * tamanhoJogo];
        g = gabarito(tamanhoJogo);
        if (tamanhoJogo == 3) {
            for (int i = 0; i < 9; i++) {
                if (celulas[i] == g[i]) {
                    resposta = true;
                }
            }
        } else {
            for (int i = 0; i < 16; i++) {
                if (celulas[i] == g[i]) {
                    resposta = true;

                }
            }
        }
        return resposta;

    }*/
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
