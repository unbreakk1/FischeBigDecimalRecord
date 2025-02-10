package unbreakk1;

import java.util.List;

public class MainBonusOne
{
    public static void main(String[] args)
    {
        Species dogSpecies = new Species("Dog", 1000);  // Food requirement: 1000 grams/day
        Species catSpecies = new Species("Cat", 300);   // Food requirement: 300 grams/day
        Species parrotSpecies = new Species("Parrot", 150); // Food requirement: 150 grams/day

        Owner owner1 = new Owner("John McFluffypants", 40, "100 Rainbow Road");
        Owner owner2 = new Owner("Sally Snickerdoodle", 32, "999 Candy Cane Lane");

        Animal animal1 = new Animal(1, "Sir Barkington", dogSpecies, 5, owner1);
        Animal animal2 = new Animal(2, "Meowzilla", catSpecies, 3, owner2);
        Animal animal3 = new Animal(3, "Chirpy McFeathers", parrotSpecies, 2, owner1);
        Animal animal4 = new Animal(4, "Fluffy", dogSpecies, 7, owner2);

        Zoo zoo = new Zoo("Funny Friends Zoo", List.of(animal1, animal2, animal3, animal4));

        zoo.displayAnimals();

        int totalFoodRequirement = zoo.calculateTotalFoodRequirement();
        System.out.println("\nTotal Food Requirement of all Animals: " + totalFoodRequirement + " grams/day");
    }
}
