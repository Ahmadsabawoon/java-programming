package day_24_loops;

import java.util.Scanner;

public class GiveMe50$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 dollars");
        int dollars = scan.nextInt();

        while (dollars !=5) {
            System.out.println("give me 5 dollars" );
            dollars = scan.nextInt();

        }
        System.out.println("Thank you for 5 dollars");
    }
}
