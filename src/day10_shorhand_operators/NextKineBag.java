package day10_shorhand_operators;
import java.util.Scanner;
public class NextKineBag {
    public static void main(String[] args) {
        System.out.println(" Enter rent and month :");
        Scanner scan = new Scanner(System.in);
        double rent = scan.nextDouble();
        scan.nextLine(); // fix the bug workaround
        String month = scan.nextLine();
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);
        int cents = 568;
        System.out.println("cents = " + cents);
        //keep whole dollars portion and just assign remaining cents
        cents = cents % 100;
        System.out.println("remaining cents = " + cents);


    }
}
