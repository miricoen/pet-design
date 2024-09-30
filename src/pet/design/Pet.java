package pet.design;

import java.util.Objects;

public abstract class Pet {
    private String name;
    private int age;
    protected String species;

    public Pet() {
    }

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }


    public abstract String makeSound();

    public abstract String eat();


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(name, pet.name) && Objects.equals(species, pet.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, species);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

}
