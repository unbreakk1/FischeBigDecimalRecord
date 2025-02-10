package unbreakk1;

public record Animal(int id, String name, Species species, int age, Owner owner)
{
    // With-method for 'id'
    public Animal withId(int id)
    {
        return new Animal(id, this.name, this.species, this.age, this.owner);
    }

    // With-method for 'name'
    public Animal withName(String name)
    {
        return new Animal(this.id, name, this.species, this.age, this.owner);
    }

    // With-method for 'species'
    public Animal withSpecies(Species species)
    {
        return new Animal(this.id, this.name, species, this.age, this.owner);
    }

    // With-method for 'age'
    public Animal withAge(int age)
    {
        return new Animal(this.id, this.name, this.species, age, this.owner);
    }

    // With-method for 'owner'
    public Animal withOwner(Owner owner)
    {
        return new Animal(this.id, this.name, this.species, this.age, owner);
    }

}
