package PuzzleN;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Usuario Puzzle = new Usuario();
        String x;
        int y;
        System.out.println("Digite seu nome:");
        x = input.nextLine();
        Puzzle.setNomeUsuario(x);
        System.out.println("Tamanho do jogo ");
        y = input.nextInt();
        Puzzle jogo1 = new Puzzle();
        jogo1.NiveldoPuzzle(y);



    }

}

