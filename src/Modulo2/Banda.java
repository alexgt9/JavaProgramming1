package Modulo2;

public class Banda {
    String nombre;
    int cantidadIntegrantes;
    private String generoMusical;

    public Banda(String generoMusical){
        this.generoMusical = generoMusical;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }
}
