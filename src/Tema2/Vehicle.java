package Tema2;

public class Vehicle {
    String brand;
    String plate;
    private String model;
    String color;

    public Vehicle() {
        this.brand = "Dacia";
        this.plate = "B 123 ABC";
        this.model = "Logan";
        this.color = "White";
    }

    public Vehicle(String brand, String plate, String model, String color) {
        this.brand = brand;
        this.plate = plate;
        this.model = model;
        this.color = color;
    }

    public void start() {
        System.out.println("Tema2.Vehicle started");
    }

    public String getDescription() {
        return brand + " " + this.model + " " + plate;
    }

    static public void brum() {
        System.out.println("brum brum");
    }
}
