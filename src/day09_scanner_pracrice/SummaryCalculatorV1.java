package day09_scanner_pracrice;

public class SummaryCalculatorV1 {
    public static void main(String[] args) {
        System.out.println("Enter hourly day");
        double hourlyRate = 50.0;
        double weeklyPay = hourlyRate*40;
        double monthlyPay = weeklyPay * 52 / 12;
        double annualPay = monthlyPay * 12;



        System.out.println("weeklyPay:" + weeklyPay);
        System.out.println(" monthly pay: " + monthlyPay);
        System.out.println("annualPay : " + annualPay);


    }
}
