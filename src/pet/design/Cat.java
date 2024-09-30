package pet.design;

import java.util.Objects;

public class Cat extends Pet {

    private String color;

    public Cat() {
    }

    public Cat(String name, int age, String species, String color) {
        super(name, age, species);
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Cats eat cat food";
    }

    @Override
    public String eat() {
        return "Cats meow";
    }

    @Override
    public String toString() {
        return "The  " + color +
                " cat " + getName() + '\'' +
                " is " + getAge() + " years old and her gender is:" +
                species;
    }


    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    public String getColor() {
        return color;
    }
}
