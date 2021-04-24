package day09_scanner_pracrice;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" How many hours you did exercise yesterday");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println(num1 + num2 + num3); // int results = num1 + num2 + num3;
        int result = num1+num2;
        System.out.println(result);



    }
}
