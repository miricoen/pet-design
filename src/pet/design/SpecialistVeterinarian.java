package pet.design;

public class SpecialistVeterinarian extends GeneralVeterinarian {

    private String specialty;

    public SpecialistVeterinarian(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }

    @Override
    public String examinePet(Pet pet) {
        return "The specialis veterinarian " + getName() + " with a specialty in " + specialty + " is giving a general checkup to " + pet.getName() + ".";
    }
}
