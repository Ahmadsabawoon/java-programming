package day18_condition_practice_strings_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        // 3 number find the largest one
        int num1 = 1000;
        int num2 = 1000;
        int num3 = 100;
        if(num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest");
        } else if(num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the larges");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3 + " is the larges");  // System.out.println(num3 is the largest)
        }

    }
}
