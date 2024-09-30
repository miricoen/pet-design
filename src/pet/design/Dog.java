package pet.design;

import java.util.Objects;

public class Dog extends Pet {
    private String breed;

    public Dog() {
    }

    public Dog(String name, int age, String species, String breed) {
        super(name, age, species);
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Dogs bark";
    }

    @Override
    public String eat() {
        return "Dogs eat dog food";
    }

    @Override
    public String toString() {
        return "The dog " + getName() +
                "is a " + getAge() + " year-old " + breed
                + " and his gender is: "
                + species;
    }


    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }


    public String getBreed() {
        return breed;
    }
}
