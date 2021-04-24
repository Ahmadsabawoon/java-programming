package day09_scanner_pracrice;
import java.util.Scanner;
public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Change Miles to Km: ");
        double miles = scan.nextDouble();
        double km = miles *1.609;
        System.out.println(miles+ "miles in kilometers = " + km);
    }


}
