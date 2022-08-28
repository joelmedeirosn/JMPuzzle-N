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
    private int[] celulas;

    public int NiveldoPuzzle(int tamanhoJogo) {
        if (tamanhoJogo > 2 && tamanhoJogo < 5) {
            this.tamanhoJogo = tamanhoJogo;
            this.celulas = new int[this.tamanhoJogo * tamanhoJogo];
            this.numCelulas = (this.tamanhoJogo * this.tamanhoJogo) - 1;
            return (this.numCelulas);
        } else {
            System.out.println("Esse nivel nao existe");
            return (0);
        }

    }

    public void Randomizar(int numCelulas) {
        Set<Integer> numeros = new HashSet<>();
        this.numCelulas = numCelulas;
        Random random = new Random();
        this.celulas[this.numCelulas] = this.branco = 0;
        for (int i = 0; i < this.numCelulas; i++) {
            this.celulas[i] = random.nextInt(this.numCelulas) + 1;  

        }
        System.out.print(Arrays.toString(celulas));

    }

}
