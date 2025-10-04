package Modulo3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[6];

        animals[0] = new Animal(1, "Oso");
        animals[1] = new Animal(2, "Loro");


        System.out.println("----- Jungla ----");
        Jungla jungla = new Jungla(animals);

        jungla.printAnimals();

        jungla.addAnimal(new Animal(3, "Perro"), 1); // no lo añadirá
        jungla.addAnimal(new Animal(4, "Loro"), 2); // lo añadirá

        System.out.println("----- Jungla actualizada ----");
        jungla.printAnimals();


        System.out.println("----- Matrices ----");
        String[][] matriz = {
            {"Juan", "Paco", ""},
            {"Pepito", "", ""},
            {"Roberto", "Luis", ""},
        };

        System.out.println("\nMatriz 3x3:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----- Menu Scanner ----");

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 5) {
            System.out.println("\n=== Soccer Menu ===");
            System.out.println("1. Show Player Info");
            System.out.println("2. Show Team Info");
            System.out.println("3. Player Action");
            System.out.println("4. Team Action");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Show Player Info action has been executed");
                    break;
                case 2:
                    System.out.println("Show Team Info action has been executed");
                    break;
                case 3:
                    System.out.println("Player Action has been executed");
                    break;
                case 4:
                    System.out.println("Team Action has been executed");
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();

    }
}