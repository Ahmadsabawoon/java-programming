package day_35_methods_with_param;

public class MultipleParams {
    public static void main(String[] args) {
        showSum(15,65);
        oddAndEven(22, 44);

    }

    public static void showSum(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println(sum);

    }
    public static void oddAndEven(int num1 , int num2) {
        if(num1 % 2 == 0) {
            if(num2 % 2 == 0)
            System.out.println(num1 + " is Even number");
            System.out.println(num2 + " is Even number");
        } else {
            System.out.println("is odd number ");
        }
/*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 doubles:");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();

        showSum(d1, d2);

        showSum(10.45, 55.10);
    }

    public static void showSum(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println("The Sum = " + sum);
    }
}
 */
    }
}
