package day10_shorhand_operators;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather = scan.nextLine();
        System.out.println("Today weather is " + weather + "\n" + "is a nice day today!"); // next() | nextline()

    }
}
