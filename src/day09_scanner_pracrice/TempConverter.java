package day09_scanner_pracrice;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Change Fahrenheit to Celsius: ");
        System.out.println("Enter fahrenheit value");
        double fahrenheitValue  = scan.nextDouble();
        //double fahrenheitValue = 55.0;
        double celsiusValue = (fahrenheitValue -32);


        System.out.println(celsiusValue);
    }
}
