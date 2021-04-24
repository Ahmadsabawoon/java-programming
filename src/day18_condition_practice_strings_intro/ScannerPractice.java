package day18_condition_practice_strings_intro;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your is first name");
        String name = scan.next();
        System.out.println("what is your age?");
        int age =  scan.nextInt();
        System.out.println("What is your successful reason?");
        String SuccessfulReason = scan.next();
        SuccessfulReason += scan.nextLine();

        System.out.println("Thank you " + name + " you are " + age + " years old and your life success point is " + SuccessfulReason);
























    }
}
