package day09_scanner_pracrice;
import java.util.Scanner;
public class CentsToDollars2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents");
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("cents = " + cents);
        System.out.println("Dollars = " +dollars);
        System.out.println("remainingCents = " + remainingCents);
        // in 123 cents : 1 dollars 23 cents
        System.out.println("In " +cents+" costs: " +dollars + "dollars " + remainingCents +" cents");

    }
}
