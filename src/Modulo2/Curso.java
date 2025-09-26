package Modulo2;

import java.util.ArrayList;

public class Curso {
    static String staticNombre = "Curso estatico";
    String nombre = "Por defecto";
    String anyo;
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    static final int MAX_ALUMNOS = 5;

    private Curso(String nombre, String anyo, ArrayList<Asignatura> asignaturas) {
        System.out.println("Iniciando Curso");
        this.nombre = nombre;
        this.anyo = anyo;
        this.asignaturas = asignaturas;
    }

    static Curso crear(String nombre, String anyo) {
        return new Curso(nombre, "2024", new ArrayList<>());
    }

    static boolean ocurrioAntesDeLaPandemia(Curso curso, String anyo) {
        System.out.println(staticNombre);

        return Integer.parseInt(curso.anyo) < 2020;
    }

    public final String getNombre(){
        return nombre;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
        System.out.println("Alumno agregado: " + alumno.nombre);
    }
}
