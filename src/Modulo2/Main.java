package Modulo2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = Curso.crear("Curso de Java", "2025");
        Curso cursoDeMySql = Curso.crear("Curso de MySql", "2025");
//        Alumno alumnoPaco = new Alumno();
//
//        alumnoPaco.nombre = "Paco";
//        System.out.println(alumnoPaco.nombre);

//        cursoJava.nombre = "Curso de Java";
//        cursoDeMySql.nombre = "Curso de MySql";

        System.out.println(cursoJava.nombre);
        System.out.println(cursoDeMySql.nombre);

        Curso.staticNombre = "Curso de Java o no";

        System.out.println(cursoJava.anyo);
        System.out.println(Curso.ocurrioAntesDeLaPandemia(cursoJava, "2025"));
        System.out.println(Curso.staticNombre);

        Utils.printAppInfo();

        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.brand = "Toyota";
        System.out.println(vehicle.getDescription());
        System.out.println("Brand: " + vehicle.brand);
        Vehicle.brum();

        List<Alumno> alumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno("Juan", "123456789", "ale");
        alumnos.add(alumno1);
        alumnos.add(new Alumno("Paco", "123456789", "ale"));
        alumnos.add(new Alumno("Aleh", "123456789", "ale"));
        System.out.println(alumnos.size());


        for (Alumno alumno : alumnos) {
            System.out.println(alumno.nombre);
        }

        boolean existe = alumnos.stream().anyMatch(a -> a.nombre.equals("Juan"));
        Alumno juan = alumnos.stream().filter(a -> a.nombre.equals("Juan")).findFirst().orElse(null);
        List<Alumno> alumnosSinJuan = alumnos.stream().filter(alumno -> !alumno.nombre.equals("Juan")).toList();

        List<String> lista = new ArrayList<>();
        lista.add("que");
        lista.add("Hola");
        lista.add("tal");
        System.out.println(lista);
        System.out.println(lista.size());
        lista.sort(String::compareTo);
        System.out.println(lista);
        lista.remove(1);

        Banda miBanda = new Banda("Rock");
        miBanda.nombre = "Juan";
        miBanda.cantidadIntegrantes = 6;

        System.out.println(miBanda.nombre);
        System.out.println(miBanda.cantidadIntegrantes);
        System.out.println(miBanda.getGeneroMusical());
    }
}