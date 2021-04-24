package day11_comparison_operators;

public class BooleanComparisonOperator {
    public static void main(String[] args) {
        System.out.println(10==10); // true 10 equal 10
        System.out.println(1000>100); // true 1000 is greater than 100
        System.out.println(985.44<985.8); // true
        System.out.println(10<=11); // true
        System.out.println(10>=3); // true
        System.out.println(-100!=44); // true -100 is not equal 44

        int a = 100;
        int b = 200;
        System.out.println(a == b);  // false
        System.out.println(a > b);   // false
        System.out.println(a < b);   // true
        System.out.println(a >= b);  // false
        System.out.println(a <= b);  // true
        System.out.println(a != b);  // true

        boolean result = 5 == 5;
        System.out.println("result = " + result);
        
        result = 33 > 34;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result = " + result);
        
        result = 10 >= 10;
        System.out.println("result = " + result);
        
        result = 123 <= 124;
        System.out.println("result = " + result);
        
        result = 2 != 2;
        System.out.println("result = " + result);

        String city = "seattle";
        System.out.println(city == "seattle");
        System.out.println(city == "baku");
        
        String name = "Seyar";
        boolean checkName = name == "seyar";
        System.out.println("checkName = " + name);
        
        checkName = name != "kuzzat";
        System.out.println("checkName = " + checkName);
        
        









































    }
}
