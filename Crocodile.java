public class Crocodile extends Animal {
    private double length;

    public Crocodile(String name, int age, double length) {
        super(name, age, "Hiss");
        this.length = length;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: " + getSound() + "!");
    }

    public double getLength() {
        return length;
    }
}