package Modulo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Modulo 1");
        System.out.println("----");

        System.out.println("1. Crea una clase Coche y piensa posibles atributos que podríamos añadirle. Instáncialo en Main y muestra por pantalla esos atributos.");

        Car audi = new Car("Audi", "Azul", 2016);
        System.out.println("Car model: " + audi.model + ", color: " + audi.color + ", year: " + audi.year);

        System.out.println("----");

        System.out.println("2. Crea una clase Libro con 3 atributos de diferentes tipos. Crea 3 libros en Main y muestra sus diferencias mediante prints.");
        Book firstBook = new Book("1984", "George Orwell", 328);
        Book secondBook = new Book("Animal farm", "George Orwell", 92);
        Book thirdBook = new Book("The Road to Wigan Pier", "George Orwell", 178);

        System.out.println("All of these are books of " + firstBook.author + ": " + firstBook.name + ", " + secondBook.name + ", "  + thirdBook.name + "." );

        System.out.println("----");

        System.out.println("3. Crea una clase CuentaBancaria con los atributos saldo (double) y titular (string). Crea dos cuentas en Main y muestra sus datos mediante prints.");

        BankAccount myBankAccount = new BankAccount("Miquel", 500.0);
        BankAccount yourBankAccount = new BankAccount("Ale", 1.213123);

        System.out.println(myBankAccount.name + " has " + myBankAccount.amount + "€ and " + yourBankAccount.name + " has " + yourBankAccount.amount + "€.");

        System.out.println("----");

        System.out.println("4. Vamos a crear una cartelera de cine y mostrársela a nuestros usuarios. Crea una clase que defina las películas y otra que defina los productos que se venden en el cine. Muestra de una manera creativa un listado con la información de las películas y los productos que pueden comprar en el cine.");

        // Cinema Movies
        Movie movie1 = new Movie("The Matrix", "The Wachowskis", 136);
        Movie movie2 = new Movie("Inception", "Christopher Nolan", 148);

        System.out.println("🎬 CINEMA MOVIES:");
        System.out.println("• " + movie1.title + " - Director: " + movie1.director + " (" + movie1.duration + " min)");
        System.out.println("• " + movie2.title + " - Director: " + movie2.director + " (" + movie2.duration + " min)");

        // Cinema Products
        CinemaProduct product1 = new CinemaProduct("Popcorn", 4.50, 25);
        CinemaProduct product2 = new CinemaProduct("Soda", 3.75, 30);

        System.out.println("🍿 CINEMA PRODUCTS:");
        System.out.println("• " + product1.name + " - €" + product1.price + " (Stock: " + product1.stock + ")");
        System.out.println("• " + product2.name + " - €" + product2.price + " (Stock: " + product2.stock + ")");


        System.out.println("----");

        System.out.println("5. Vamos a crear el menú de un restaurante y mostrárselo a nuestros usuarios. Crea una clase que represente los productos y muestra por pantalla dicho menú de una manera creativa visualmente hablando.");

        // Restaurant Menu Items
        MenuItem item1 = new MenuItem("Pasta Carbonara", 12.99, "Main Course");
        MenuItem item2 = new MenuItem("Caesar Salad", 8.50, "Appetizer");
        MenuItem item3 = new MenuItem("Tiramisu", 6.75, "Dessert");

        System.out.println("🍽️ RESTAURANT MENU:");
        System.out.println("• " + item1.name + " - €" + item1.price + " [" + item1.category + "]");
        System.out.println("• " + item2.name + " - €" + item2.price + " [" + item2.category + "]");
        System.out.println("• " + item3.name + " - €" + item3.price + " [" + item3.category + "]");

        System.out.println("----");

        System.out.println("6. Ejemplo con Scanner para crear una cuenta bancaria.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Deposit your money: ");
        int amount = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(name, amount);

        System.out.println("Thanks " + bankAccount.name + ", we have your money now: " + bankAccount.amount + ".");
    }
}