package Tema2;

public class Alumno {
    String nombre;
    String telefono;
    String email;

    public Alumno(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Alumno {" + nombre + ", telefono=" + telefono + ", email=" + email + '}';
    }
}
