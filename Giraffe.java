public class Giraffe extends Animal {
    private double neckLength;

    public Giraffe(String name, int age, double neckLength) {
        super(name, age, "Hum");
        this.neckLength = neckLength;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: " + getSound() + "!");
    }

    public double getNeckLength() {
        return neckLength;
    }
}