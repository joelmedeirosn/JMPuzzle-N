package PuzzleN;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tamanhoJogo;
        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho jogo mano");
        tamanhoJogo = input.nextInt();

        Puzzle jogo1 = new Puzzle();
        int numeroCelulas = jogo1.NiveldoPuzzle(tamanhoJogo);
        if (numeroCelulas != 0)
            jogo1.Randomizar(numeroCelulas);
    }

}
