package day14_multi_brach_if_statement;
import java.util.Scanner;
public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //double num1 = 44.3;
       // double num2 = 23.4;
        System.out.println("Enter 2 numbers:");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("enter operator: - , +, *, /");
        char operator = scan.next().charAt(0);
        if(operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '_') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operator" + operator);
        }


































    }
}
