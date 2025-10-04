package Modulo3;

public class Animal {
    private int id;
    private String nombre;

    public Animal(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void printInfo() {
        System.out.println(getId() + ": " + getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
