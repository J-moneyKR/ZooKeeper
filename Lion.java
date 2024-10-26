public class Lion extends Animal {
    private boolean isMale;

    public Lion(String name, int age, boolean isMale) {
        super(name, age, "Roar");
        this.isMale = isMale;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: " + getSound() + "!");
    }

    public boolean isMale() {
        return isMale;
    }
}