public class Penguin extends Animal {
    private String species;

    public Penguin(String name, int age, String species) {
        super(name, age, "Honk");
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