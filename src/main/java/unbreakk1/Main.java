package unbreakk1;

public class Main
{
    public static void main(String[] args)
    {
        Species dogSpecies = new Species("Dog", 1000); // Food requirement: 1000 grams/day
        Species catSpecies = new Species("Cat", 300);  // Food requirement: 300 grams/day
        Species parrotSpecies = new Species("Parrot", 150); // Food requirement: 150 grams/day

        // Create Owner instances
        Owner owner1 = new Owner("John McFluffypants", 40, "100 Rainbow Road");
        Owner owner2 = new Owner("Sally Snickerdoodle", 32, "999 Candy Cane Lane");

        // Create Animal instances and share Species instances
        Animal animal1 = new Animal(1, "Sir Barkington", dogSpecies, 5, owner1);
        Animal animal2 = new Animal(2, "Meowzilla", catSpecies, 3, owner2);
        Animal animal3 = new Animal(3, "Chirpy McFeathers", parrotSpecies, 2, owner1); // Another animal owned by John
        Animal animal4 = new Animal(4, "Fluffy", dogSpecies, 7, owner2); // Another dog with the same species

        // Test the toString method for both Animal, Owner, and Species
        System.out.println("== Testing toString Methods ==");
        System.out.println(animal1); // Includes Species details
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);

        // Access Species and Food Requirements
        System.out.println("\n== Access Species and Food Requirements ==");
        System.out.println("Animal1 (" + animal1.name() + ") Species: " + animal1.species().name());
        System.out.println("Animal1 Food Requirement: " + animal1.species().foodRequirementGramsPerDay() + " grams/day");
        System.out.println("Animal4 (" + animal4.name() + ") has the same Species as Animal1: "
                + (animal1.species() == animal4.species())); // Should be true

        // Access Owner Details
        System.out.println("\n== Accessing Owners ==");
        System.out.println("Animal2 Owner Name: " + animal2.owner().name());
        System.out.println("Animal3 Owner Address: " + animal3.owner().address());
    }
}