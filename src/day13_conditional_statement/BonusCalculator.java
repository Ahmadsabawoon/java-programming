package day13_conditional_statement;

public class BonusCalculator {
    public static void main(String[] args) {

        double bonus = 0.0;
        double salesAmount = 5000;
        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualified for full bonus");
            bonus = 50.0;
        } else {
            System.out.println("Good job, you qualified for full bonus" + bonus);
            bonus = 100;

        }
        System.out.println("Your bonus for this sale is: $" + bonus);


    }
}
