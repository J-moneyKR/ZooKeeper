public class Owl extends Animal {
    private String species;

    public Owl(String name, int age, String species) {
        super(name, age, "Hoot");
        this.species = species;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: " + getSound() + "!");
    }

    public String getSpecies() {
        return species;
    }
}