import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooKeeper {
    private static List<Animal> animals = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the ZooKeeper!");
        
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add an animal");
            System.out.println("2. List all animals");
            System.out.println("3. Make all animals sound");
            System.out.println("4. Exit");
            
            int choice = getIntInput("Enter your choice: ");
            
            switch (choice) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    listAnimals();
                    break;
                case 3:
                    makeAllAnimalsSounds();
                    break;
                case 4:
                    System.out.println("Thank you for using ZooKeeper. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addAnimal() {
        System.out.println("\nWhat type of animal would you like to add?");
        System.out.println("1. Lion   2. Elephant   3. Penguin   4. Giraffe   5. Monkey");
        System.out.println("6. Crocodile   7. Kangaroo   8. Camel   9. Owl");
        
        int choice = getIntInput("Enter your choice: ");
        
        String name = getStringInput("Enter the animal's name: ");
        int age = getIntInput("Enter the animal's age: ");
        
        Animal animal;
        switch (choice) {
            case 1:
                boolean isMale = getBooleanInput("Is the lion male? (true/false): ");
                animal = new Lion(name, age, isMale);
                break;
            case 2:
                double trunkLength = getDoubleInput("Enter the elephant's trunk length (in meters): ");
                animal = new Elephant(name, age, trunkLength);
                break;
            case 3:
                String penguinSpecies = getStringInput("Enter the penguin's species: ");
                animal = new Penguin(name, age, penguinSpecies);
                break;
            case 4:
                double neckLength = getDoubleInput("Enter the giraffe's neck length (in meters): ");
                animal = new Giraffe(name, age, neckLength);
                break;
            case 5:
                String monkeySpecies = getStringInput("Enter the monkey's species: ");
                animal = new Monkey(name, age, monkeySpecies);
                break;
            case 6:
                double length = getDoubleInput("Enter the crocodile's length (in meters): ");
                animal = new Crocodile(name, age, length);
                break;
            case 7:
                double jumpHeight = getDoubleInput("Enter the kangaroo's jump height (in meters): ");
                animal = new Kangaroo(name, age, jumpHeight);
                break;
            case 8:
                int numHumps = getIntInput("Enter the number of humps: ");
                animal = new Camel(name, age, numHumps);
                break;
            case 9:
                String owlSpecies = getStringInput("Enter the owl's species: ");
                animal = new Owl(name, age, owlSpecies);
                break;
            default:
                System.out.println("Invalid choice. Animal not added.");
                return;
        }
        
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the zoo!");
    }

    private static void listAnimals() {
        if (animals.isEmpty()) {
            System.out.println("There are no animals in the zoo yet.");
        } else {
            System.out.println("\nAnimals in the zoo:");
            for (Animal animal : animals) {
                System.out.println("- " + animal.getName() + " (" + animal.getClass().getSimpleName() + ")");
            }
        }
    }

    private static void makeAllAnimalsSounds() {
        if (animals.isEmpty()) {
            System.out.println("There are no animals in the zoo to make sounds.");
        } else {
            System.out.println("\nAll animals are making their sounds:");
            for (Animal animal : animals) {
                animal.makeSound();
            }
        }
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private static boolean getBooleanInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("true") || input.equals("false")) {
                return Boolean.parseBoolean(input);
            }
            System.out.println("Invalid input. Please enter true or false.");
        }
    }
}