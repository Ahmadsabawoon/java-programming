package day07_arthimatic_operating_costing;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(10 + 5);
        System.out.println(10 + 5 -3);  // 12
        System.out.println(10 - 5 + 3); //8
        System.out.println(10 -(5+3) );// 2

        System.out.println(2 * 5); // 6
        System.out.println(2 *3 / 3); //2
        System.out.println(20 / (2*2)); // 5

        // System.out.println(10 / 0);// cannot divided by ZERO. error while code running.
        System.out.println(2 + 5 * 3);
        System.out.println((2+5) *3);// 21
        // in java, if you try to divide any number by zero, error will happen during runtime.
        // int num = 10;
        // System.out.println(num/0);it will run error.
        System.out.println(10 / 3);// 3 java will throw away the number that not complete the goal.

        // Integer division problem.
        System.out.println(10/3);
        int num1 = 40;
        int num2 = 15;
        System.out.println(num1/num2);

        System.out.println(10.0/3.0);
        System.out.println(10.0/3);

        double d1 = 12;
        double d2 = 3;
        System.out.println(d1/d2);

        int count = 100;
        double dCount = 30.0;
        System.out.println(count/dCount);

    }
}


