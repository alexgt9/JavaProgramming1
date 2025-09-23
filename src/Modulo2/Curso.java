package Modulo2;

import java.util.ArrayList;

public class Curso {
    static String staticNombre = "Curso estatico";
    String nombre = "Por defecto";
    String anyo;

    static final int MAX_ALUMNOS = 5;

    private Curso(String nombre, String anyo) {
        System.out.println("Iniciando Curso");
        this.nombre = nombre;
        this.anyo = anyo;
    }

    static Curso crear(String nombre, String anyo) {
        return new Curso(nombre, "2024");
    }

    static boolean ocurrioAntesDeLaPandemia(Curso curso, String anyo) {
        System.out.println(staticNombre);

        return Integer.parseInt(curso.anyo) < 2020;
    }

    public final String getNombre(){
        return nombre;
    }
}
