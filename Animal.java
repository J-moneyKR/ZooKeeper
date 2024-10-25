public abstract class Animal {
    protected String name;
    protected int age;
    protected String gender;
    protected double weight;

    public Animal(String name, int age, String gender, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public abstract String makeSound();

    public abstract String getSpecies();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s (Species: %s, Name: %s, Age: %d, Gender: %s, Weight: %.2f kg)",
                getClass().getSimpleName(), getSpecies(), name, age, gender, weight);
    }
}