package day09_scanner_pracrice;

import java.util.Scanner;

public class AskAgeV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How od are you?");
        int age = scan.nextInt();// int age = 11;
        System.out.println(age + " -That is great age" );
        // scan.close()

    }
}
