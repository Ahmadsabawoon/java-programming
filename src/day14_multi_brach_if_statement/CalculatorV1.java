package day14_multi_brach_if_statement;

public class CalculatorV1 {
    public static void main(String[] args) {
       // - , +, *, /      ===> when operator: + : add num1, num2
        //when operator: - : minus num1, num2
        //when operator: * : multiply num1, num2
        //when operator: / : divide num1, num2
        //any other: "invalid operator"
        // import java.util.Scanner;
        //
        //public class CalculatorV1 {
        //    public static void main(String[] args) {
        //        Scanner scan=new Scanner(System.in);
        //        String scan2;
        //        System.out.println("enter operation numbers");
        //        double num1= scan.nextDouble();
        //        scan2= scan.next();
        //        double num2=scan.nextDouble();
        //
        //        if (scan2.equals("-")){
        //            System.out.println(num1+" - "+num2+" = "+(num1-num2));
        //        }else if(scan2.equals("+")){
        //            System.out.println(num1+" + "+num2+" = "+(num1+num2));
        //        }else if(scan2.equals("/")){
        //            System.out.println(num1+" / "+num2+" = "+(num1/num2));
        //        }else if(scan2.equals("*")) {
        //            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        //        }else {
        //            System.out.println("wrong enter");
        double num1 = 6.3;
        double num2 = 5.4;

        char operator = '*';
        if(operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
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
