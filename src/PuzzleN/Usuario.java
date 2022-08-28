package PuzzleN;
import java.util.Scanner;

public class Usuario extends Puzzle {
    
    private String nomeUsuario;
    private int tamanhoJogo;

    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario=nomeUsuario;
    }
    public void setTamanhoJogo(int tamanhoJogo){
        this.tamanhoJogo=tamanhoJogo;
    }
    public String getNomeUsuario(){
        return this.nomeUsuario;
    }
    public int getTamanhoJogo(){
        return this.tamanhoJogo;
    }


    }
