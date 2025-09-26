package Modulo2;

import java.util.ArrayList;

public class Asignatura {
    String nombre;
    // 1 - 2
    int semestre;

    ArrayList<Tema> temas;

    public  Asignatura(String nombre, int semestre, ArrayList<Tema> temas) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.temas = temas;
    }
}
