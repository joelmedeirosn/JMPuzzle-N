package PuzzleN;

import java.util.Arrays;
import java.util.Random;

public class CaracterP extends Puzzle{
    private char[] celulaschar = new  char [] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};


    public int NiveldoPuzzle(int tamanhoJogo) {
            if (tamanhoJogo > 2 && tamanhoJogo < 5) {
            setTamanhoJogo(tamanhoJogo);
            this.celulaschar= new char[getTamanhoJogo() * tamanhoJogo];
            setNumCelulas(getTamanhoJogo() * getTamanhoJogo() - 1);
            return (getNumCelulas());
        } else {
            System.out.println("Esse nivel nao existe sa");
            return (0);
        }

    }
    public void Randomizar(int numCelulas){
        setNumCelulas(numCelulas);
        Random random = new Random();
        this.celulaschar[getNumCelulas()]= ' ';
        setBranco(0);
        for (int i = 0; i < celulaschar.length; i++) {
            int rand = random.nextInt(celulaschar.length);
            char prov= celulaschar[i];
            celulaschar[i] = celulaschar[rand];
            celulaschar[rand]=prov;


        }
        System.out.print(Arrays.toString(celulaschar));


    }

}
