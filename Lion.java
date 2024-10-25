public class Lion extends Animal {
    private double maneLength;

    public Lion(String name, int age, String gender, double weight, double maneLength) {
        super(name, age, gender, weight);
        this.maneLength = maneLength;
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }

    @Override
    public String getSpecies() {
        return "Panthera leo";
    }

    public double getManeLength() {
        return maneLength;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Mane Length: %.2f cm", maneLength);
    }
}