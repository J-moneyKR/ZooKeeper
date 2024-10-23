import java.io.File;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
public class zookeeper {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        Random rand = new Random();
        double randTemp = rand.nextDouble(150);
        System.out.println("Please enter the number of the habitat you would like to view:");
        System.out.println("1:Peter Griffin");
        System.out.println("2:Camel");
        System.out.println("3:Chris Griffin");
        System.out.println("4:Brian Griffin");
        System.out.println("5:Evil Monkey");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
if (number .equals(1)) {
    System.out.println("The Temperature " + randTemp + "F");
    System.out.println("Animal Type: Peter Griffin");
    System.out.println("The date is " + now.format(formatter));
    File file = new File("C:\\Users\\fryerj_wlhs\\IdeaProjects\\Zookeeper\\animals\\petergriffin.txt");
    try{
        Scanner fr = new Scanner(file);
        while(fr.hasNextLine()){
            String i = fr.nextLine();
            System.out.println(i);
        }
        System.out.println("You've reached the end of the program. To check another habitat, please restart the watcher");
    } catch (Exception e){
        System.out.println("No file");
    }
} else if (number .equals(2)) {
    System.out.println("The Temperature " + randTemp + "F");
    System.out.println("Animal Type: Camel");
    System.out.println("The date is " + now.format(formatter));
    File file = new File("C:\\Users\\fryerj_wlhs\\IdeaProjects\\Zookeeper\\animals\\camel.txt");
    try{
        Scanner fr = new Scanner(file);
        while(fr.hasNextLine()){
            String i = fr.nextLine();
            System.out.println(i);
        }
        System.out.println("You've reached the end of the program. To check another habitat, please restart the watcher");
    } catch (Exception e){
        System.out.println("No file");
    }
} else if (number .equals(3)) {
    System.out.println("The Temperature " + randTemp + "F");
    System.out.println("Animal Type: Chris Griffin");
    System.out.println("The date is " + now.format(formatter));
    File file = new File("C:\\Users\\fryerj_wlhs\\IdeaProjects\\Zookeeper\\animals\\chrisgriffin.txt");
    try{
        Scanner fr = new Scanner(file);
        while(fr.hasNextLine()){
            String i = fr.nextLine();
            System.out.println(i);
        }
        System.out.println("You've reached the end of the program. To check another habitat, please restart the watcher");
    } catch (Exception e){
        System.out.println("No file");
    }

} else if (number .equals(4)) {
    System.out.println("The Temperature " + randTemp + "F");
    System.out.println("Animal Type: Brian Griffin");
    System.out.println("The date is " + now.format(formatter));
    File file = new File("C:\\Users\\fryerj_wlhs\\IdeaProjects\\Zookeeper\\animals\\brian.txt");
    try{
        Scanner fr = new Scanner(file);
        while(fr.hasNextLine()){
            String i = fr.nextLine();
            System.out.println(i);
        }
        System.out.println("You've reached the end of the program. To check another habitat, please restart the watcher");
    } catch (Exception e){
        System.out.println("No file");
    }
} else if (number .equals(5)) {
    System.out.println("The Temperature " + randTemp + "F");
    System.out.println("Animal Type: Evil Monkey");
    System.out.println("The date is " + now.format(formatter));
    File file = new File("C:\\Users\\fryerj_wlhs\\IdeaProjects\\Zookeeper\\animals\\evilMonkey.txt");
    try{
        Scanner fr = new Scanner(file);
        while(fr.hasNextLine()){
            String i = fr.nextLine();
            System.out.println(i);
        }
        System.out.println("You've reached the end of the program. To check another habitat, please restart the watcher");
    } catch (Exception e){
        System.out.println("No file");
    }

} else {
    System.out.println("You picked a number that does not exist try again");


}

    }
}