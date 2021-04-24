package day09_scanner_pracrice;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double price1, price2, price3;
        System.out.println("Enter price for milk:");
        price1 = scan.nextDouble();

        System.out.println(" Enter price bread:");
         price2 = scan.nextDouble();

        System.out.println("Enter price for cucumbers");
        price3 = scan.nextDouble();

        double totalAmount = price1 + price2 + price3;
        System.out.println("total price is : $" + totalAmount );






    }
}
