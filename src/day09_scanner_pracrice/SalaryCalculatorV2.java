package day09_scanner_pracrice;
import java.util.Scanner;

public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyRate = scan.nextInt();
       double weeklyPay =  hourlyRate * 25;
        double monthlyPay = weeklyPay * 52 / 12;
        double annualPay = monthlyPay * 12;

        System.out.println("weeklyPay:" + weeklyPay);
        System.out.println(" monthly pay: " + monthlyPay);
        System.out.println("annualPay : " + annualPay);









    }
}
