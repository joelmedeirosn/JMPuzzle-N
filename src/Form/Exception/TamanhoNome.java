package Form.Exception;

public class TamanhoNome extends Exception{

    public TamanhoNome(){
        super ();


    }

    @Override
    public String toString() {

        return "por favor digite seu nome corretamente";
    }
}
