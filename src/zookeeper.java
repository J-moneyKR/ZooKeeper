import java.io.File;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class zookeeper {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Please enter the number of the habitat you would like to view:");
        System.out.println("1:Peter Griffin");
        System.out.println("2:Camel");
        System.out.println("3:Chris Griffin");
        System.out.println("4:Brian Griffin");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
if (number .equals(1)) {
    File file = new File("C:\\Users\\fryerj_wlhs\\IdeaProjects\\Zookeeper\\animals\\petergriffin.txt");
    try{
        Scanner fr = new Scanner(file);
        while(fr.hasNextLine()){
            String i = fr.nextLine();
            System.out.println(i);
        }
    } catch (Exception e){
        System.out.println("No file");
    }
} else if (number .equals(2)) {
    File file = new File("C:\\Users\\fryerj_wlhs\\IdeaProjects\\Zookeeper\\animals\\camel.txt");
    try{
        Scanner fr = new Scanner(file);
        while(fr.hasNextLine()){
            String i = fr.nextLine();
            System.out.println(i);
        }
    } catch (Exception e){
        System.out.println("No file");
    }
} else if (number .equals(3)) {
    File file = new File("C:\\Users\\fryerj_wlhs\\IdeaProjects\\Zookeeper\\animals\\chrisgriffin.txt");
    try{
        Scanner fr = new Scanner(file);
        while(fr.hasNextLine()){
            String i = fr.nextLine();
            System.out.println(i);
        }
    } catch (Exception e){
        System.out.println("No file");
    }

} else if (number .equals(4)) {
    File file = new File("C:\\Users\\fryerj_wlhs\\IdeaProjects\\Zookeeper\\animals\\brian.txt");
    try{
        Scanner fr = new Scanner(file);
        while(fr.hasNextLine()){
            String i = fr.nextLine();
            System.out.println(i);
        }
    } catch (Exception e){
        System.out.println("No file");
    }

} else {


}

    }
}