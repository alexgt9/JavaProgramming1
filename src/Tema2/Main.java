package Tema2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.brand = "Toyota";
        System.out.println("Brand: " + vehicle.brand);
    }
}