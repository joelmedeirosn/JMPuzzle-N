package Form;

import Form.Exception.TamanhoNome;

public class JogoUsuario {

    private int nivel;
    private String tipo;
    private String usuario;
    boolean maluco;

    public int getNivel() {return (nivel);}
    public void setNivel(int nivel){this.nivel = nivel;}

    public String getTipo() {return (tipo);}

    public void setTipo(String tipo) {this.tipo = tipo;}
    public String getNomeUsuario(){return usuario;}

    public void setNomeUsuario(String usuario) throws TamanhoNome {
        if(usuario==null){

        } else if (usuario.length()<=20 && usuario.length()>=4){
            this.usuario = usuario;

        } else {
            throw new TamanhoNome();
        }
    }
    public boolean getMaluco(){return maluco;}
    public void setMaluco(boolean maluco){this.maluco = maluco;}
}
