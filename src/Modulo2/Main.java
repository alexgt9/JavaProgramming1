package Modulo2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
    }
}