public class Monkey extends Animal {
    private String species;

    public Monkey(String name, int age, String species) {
        super(name, age, "Ooh ooh ah ah");
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