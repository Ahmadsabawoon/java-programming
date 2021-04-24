package day09_scanner_pracrice;
import java.util.Scanner;


public class SpeedLimitV2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println(" Enter your current speed");
        int currentSpeed = Scan.nextInt();
        int speedLimit = 55;
        int OverTheLimit = currentSpeed - speedLimit;

        System.out.println("Your are driving " + OverTheLimit + " mph over the limit. slow down");





    }

}
