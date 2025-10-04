package Modulo3;

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
    }
}