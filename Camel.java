public class Camel extends Animal {
    private int numHumps;

    public Camel(String name, int age, int numHumps) {
        super(name, age, "Grunt");
        this.numHumps = numHumps;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: " + getSound() + "!");
    }

    public int getNumHumps() {
        return numHumps;
    }
}