package PuzzleN;

import java.util.Arrays;
import java.util.Random;

public class CaracterP extends Puzzle{
    private char[] celulasChar = new  char [] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};


    public int NiveldoPuzzle(int tamanhoJogo) {
            if (tamanhoJogo == 3) {
                setTamanhoJogo(tamanhoJogo);
                celulasChar= new char[getTamanhoJogo() * tamanhoJogo];
                setNumCelulas(getTamanhoJogo() * getTamanhoJogo() - 1);
                Randomizar(getNumCelulas(),celulasChar);
                return (getNumCelulas());

            }
            if (tamanhoJogo == 4) {
                setTamanhoJogo(tamanhoJogo);
                celulasChar= new char[getTamanhoJogo() * tamanhoJogo];
                setNumCelulas(getTamanhoJogo() * getTamanhoJogo() - 1);
                Randomizar(getNumCelulas(),celulasChar);
                return (getNumCelulas());
        } else {
            System.out.println("Esse nivel nao existe ");
            return (0);
        }

    }
    public void Randomizar(int numCelulas, char[] celulasChar){
        setNumCelulas(numCelulas);
        Random random = new Random();
        celulasChar[getNumCelulas()]= ' ';
        setBranco(0);
        for (int i = 0; i < celulasChar.length; i++) {
            int rand = random.nextInt(celulasChar.length);
            char prov= celulasChar[i];
            celulasChar[i] = celulasChar[rand];
            celulasChar[rand]=prov;


        }
        System.out.print(Arrays.toString(celulasChar));


    }

}
