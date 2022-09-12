package PuzzleN;

import java.io.File;
import java.util.Arrays;
import java.util.Random;


public class ImagemP extends Puzzle {


    public int[] NiveldoPuzzle(int tamanhoJogo) {
        if (tamanhoJogo == 3 ) {
            File folder = new File ("C:\\Users\\prude\\IdeaProjects\\Puzzle-N-master\\bob esponja 9");
            File [] lista = folder.listFiles();
            setTamanhoJogo(tamanhoJogo);
            setNumCelulas(getTamanhoJogo() * getTamanhoJogo() - 1);
            RandomizarImagem(getNumCelulas(), lista);

        } else if (tamanhoJogo == 4){
            File folder = new File ("C:\\Users\\prude\\IdeaProjects\\Puzzle-N-master\\bob esponja 16");
            File [] lista = folder.listFiles();
            setTamanhoJogo(tamanhoJogo);
            setNumCelulas(getTamanhoJogo() * getTamanhoJogo() - 1);
            RandomizarImagem(getNumCelulas(), lista);
        }
        else {

            System.out.println("Esse nivel nao existe");
        }
        return null;

    }
    public void RandomizarImagem(int numCelulas,File [] lista){
        setNumCelulas(numCelulas);
        Random random = new Random();
        setBranco(0);
        for (int i = 0; i < lista.length; i++) {
            int rand = random.nextInt(lista.length);
            File prov= lista[i];
            lista[i] = lista[rand];
            lista[rand]=prov;


        }
        System.out.println(Arrays.toString(lista));

}
}
