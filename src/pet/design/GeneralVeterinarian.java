package pet.design;

public class GeneralVeterinarian implements Veterinarian {

    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
         return "The veterinarian " + getName() + " is giving a general checkup to " + pet.getName() + ".";
    }
}
