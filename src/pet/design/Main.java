package pet.design;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Pet> pets = new ArrayList<>();
        pets.add(new Dog("Buddy", 5, "male", "Golden Retriever"));
        pets.add(new Cat("Whiskers", 3, "female", "Black"));
        pets.add(new Dog("Max", 2, "female", "Bulldog"));
        pets.add(new Cat("Mittens", 4, "male", "White"));
        pets.add(new Dog("Charlie", 7, "male", "Beagle"));

        List<Veterinarian> veterinarians = new ArrayList<>();
        veterinarians.add(new GeneralVeterinarian("Shlomo"));
        veterinarians.add(new SpecialistVeterinarian("Yaakov", "ENT"));
        veterinarians.add(new GeneralVeterinarian("Shlomo"));
        veterinarians.add(new SpecialistVeterinarian("Shlomo", "Dentist"));

      for (Pet pet : pets) {
//            System.out.println("Pet: " + pet.getName() + " (" + pet.getSpecies() + ")");
//            System.out.println("Sound: " + pet.makeSound());
          System.out.println(pet);
            for (Veterinarian vet : veterinarians) {
                System.out.println(vet.examinePet(pet));
            }
            System.out.println();
        }
    }
}
