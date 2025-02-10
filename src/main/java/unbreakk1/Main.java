package unbreakk1;

public class Main
{
    public static void main(String[] args)
    {
        // Create multiple Animal instances
        Animal animal1 = new Animal(1, "Buddy", "Dog", 5);
        Animal animal2 = new Animal(2, "Mittens", "Cat", 3);
        Animal animal3 = new Animal(1, "Buddy", "Dog", 5); // Same data as animal1

        // Test the toString method
        System.out.println("== Testing toString Method ==");
        System.out.println(animal1);
        System.out.println(animal2);

        // Test the equals method
        System.out.println("\n== Testing equals Method ==");
        System.out.println("animal1 equals animal2: " + animal1.equals(animal2)); // Expected: false
        System.out.println("animal1 equals animal3: " + animal1.equals(animal3)); // Expected: true

        // Test the hashCode method
        System.out.println("\n== Testing hashCode Method ==");
        System.out.println("animal1 hashCode: " + animal1.hashCode());
        System.out.println("animal2 hashCode: " + animal2.hashCode());
        System.out.println("animal3 hashCode: " + animal3.hashCode()); // Expected to match with animal1

        // Access individual properties
        System.out.println("\n== Accessing Individual Properties ==");
        System.out.println("Animal1 Name: " + animal1.name()); // Expected: Buddy
        System.out.println("Animal2 Species: " + animal2.species()); // Expected: Cat
    }
}