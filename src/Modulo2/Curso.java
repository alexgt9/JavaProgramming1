package Modulo2;

import java.util.ArrayList;

public class Curso {
    String nombre;
    String anyo;

    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public Curso(String nombre, String anyo) {
        this.nombre = nombre;
        this.anyo = anyo;
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }
}
