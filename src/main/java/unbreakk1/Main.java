package unbreakk1;

public class Main
{
    public static void main(String[] args)
    {

        Owner owner1 = new Owner("John McFluffypants", 40, "100 Rainbow Road");
        Owner owner2 = new Owner("Sally Snickerdoodle", 32, "999 Candy Cane Lane");

        Animal animal1 = new Animal(1, "Sir Barkington", "Dog", 5, owner1);
        Animal animal2 = new Animal(2, "Meowzilla", "Cat", 3, owner2);
        Animal animal3 = new Animal(3, "Chirpy McFeathers", "Parrot", 2, owner1);

        // toString method for both Animal and Owner
        System.out.println("== Testing toString Methods ==");
        System.out.println(animal1); // Includes Owner details
        System.out.println(animal2);
        System.out.println(animal3);

        // Access details (Animal's owner)
        System.out.println("\n== Accessing Animal Owners ==");
        System.out.println("Animal1 Owner Name: " + animal1.owner().name()); // Expected: John McFluffypants
        System.out.println("Animal2 Owner Address: " + animal2.owner().address()); // Expected: 999 Candy Cane Lane

        // Test equality
        Owner anotherOwner1 = new Owner("John McFluffypants", 40, "100 Rainbow Road");
        System.out.println("\n== Testing equals on Owners ==");
        System.out.println("owner1 equals anotherOwner1: " + owner1.equals(anotherOwner1)); // Expected: true
        System.out.println("animal1 owner equals animal3 owner: " + animal1.owner().equals(animal3.owner())); // Expected: true
    }
}