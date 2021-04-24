package practice_03_09_2021;
/*
            How many seconds are in an hour?
            60 sec = 1 minute
            60 min = 1 hour
            60 * 60 = 3600
        */

import java.util.Scanner;

public class PracticeSecondConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int seconds, minutes, hours, secondsInput;
        System.out.println("Enter Seconds");
        secondsInput = scan.nextInt();
        hours = secondsInput / 3600; // 3695/3600 = 1
        secondsInput %=3600; //  95
        minutes = secondsInput/60; // 95/60 = 1
        secondsInput %= 60; // 35
        seconds = secondsInput;
        System.out.println(hours  + " hours, " +  minutes + " minutes and"  + seconds + " seconds");













    }
}
