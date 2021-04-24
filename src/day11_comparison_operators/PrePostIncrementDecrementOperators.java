package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
       // post increment //num2--;    // different will appears when we use with different numbers. -- is placed after variable name.
        //--num2; // pre increment : __ is before the variable name.
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // post increment -> add 1 afterwards
         int num3 = 8;
       // int num4 = num3;
       // num3++; // add 1
        int num4 = num3++;
        System.out.println("num3 = " + num3);//5
        System.out.println("num4 = " + num4);//4

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars);

        int sedan = 10;
        System.out.println(sedan++);

        
        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Boolean|comparison operator: == -> equals(checks if values are equal)   / >  greather than(checks if first value is great than second   /





        



        
    }
}
