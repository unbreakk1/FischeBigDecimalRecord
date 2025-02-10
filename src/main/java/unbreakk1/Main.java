package unbreakk1;

public class Main
{
    public static void main(String[] args)
    {
        Animal animal1 = new Animal(1, "Buddy", "Dog", 5);
        Animal animal2 = new Animal(2, "Mittens", "Cat", 3);

        System.out.println(animal1);
        System.out.println(animal2);

        // Accessing individual properties
        System.out.println("Animal 1 Name: " + animal1.name());
        System.out.println("Animal 2 Species: " + animal2.species());

    }
}