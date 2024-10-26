public class Kangaroo extends Animal {
    private double jumpHeight;

    public Kangaroo(String name, int age, double jumpHeight) {
        super(name, age, "Chortle");
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: " + getSound() + "!");
    }

    public double getJumpHeight() {
        return jumpHeight;
    }
}