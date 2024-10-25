public class Elephant extends Animal {
    private double trunkLength;

    public Elephant(String name, int age, String gender, double weight, double trunkLength) {
        super(name, age, gender, weight);
        this.trunkLength = trunkLength;
    }

    @Override
    public String makeSound() {
        return "Trumpet!";
    }

    @Override
    public String getSpecies() {
        return "Loxodonta";
    }

    public double getTrunkLength() {
        return trunkLength;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Trunk Length: %.2f m", trunkLength);
    }
}