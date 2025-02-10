package unbreakk1;

import java.util.List;

public record Zoo(String name, List<Animal> animals)
{
    public int calculateTotalFoodRequirement()
    {
        return animals.stream().mapToInt(animal -> animal.species().foodRequirementGramsPerDay()).sum();
    }

    public void displayAnimals()
    {
        System.out.println("== List of Animals in the Zoo (" + name + ") ==");
        animals.forEach(System.out::println);
    }

}
