package day_24_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomNum = new Random();
        //System.out.println(randomNum.nextInt(101));
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber = 0;
        do{
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if(guessingNumber > secretNumber){
                System.out.println("wrong, your name is too large ");
            } else if (guessingNumber < secretNumber){
                System.out.println("wrong, your number is too small");
            }

        } while (secretNumber != guessingNumber);
        System.out.println("Congratulations, you win! secret number: " + secretNumber);







    }
}
