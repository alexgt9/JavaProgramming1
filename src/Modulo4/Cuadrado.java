package Modulo4;

public class Cuadrado extends Figura {
    Double lado;
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}
