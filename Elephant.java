public class Elephant extends Animal {
    private double trunkLength;

    public Elephant(String name, int age, double trunkLength) {
        super(name, age, "Trumpet");
        this.trunkLength = trunkLength;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: " + getSound() + "!");
    }

    public double getTrunkLength() {
        return trunkLength;
    }
}