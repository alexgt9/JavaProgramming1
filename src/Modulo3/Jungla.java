package Modulo3;

public class Jungla {
    private int id;
    private Animal[] animals;

    public Jungla(Animal[] animals) {
        this.animals = animals;
    }

    public Animal[] getAnimals() {
        return this.animals;
    }

    public void printAnimals() {
        for (Animal animal : this.animals) {
            if (animal != null) {
                animal.printInfo();
            }
        }
    }

    public void addAnimal(Animal animal, int index) {
       if (animals[index] == null) {
           this.animals[index] = animal;
       }
    }


}
