package day_24_loops;

import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("**** Welcome to Wells fargo ATM ****");
        int secretPinCode = 1234;
        int pinCode;
        do{
            System.out.println("Enter PinCode: ");
            pinCode = scan.nextInt();

        } while(pinCode!= secretPinCode );

        System.out.println("Welcome to your bank account!");
    }
}
