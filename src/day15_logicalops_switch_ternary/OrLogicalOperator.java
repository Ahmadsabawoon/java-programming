package day15_logicalops_switch_ternary;

public class OrLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apples = 5;
        int oranges = 10;
        System.out.println(apples >3 || oranges >4);
        if(apples >3 || oranges >4){
            System.out.println("No need to buy aby fruits today");
        } else {
            System.out.println("Need to buy some fruits");
        }
        System.out.println(apples > 2 || oranges > 10);
        System.out.println(apples > 2 && oranges > 10);

        if (apples > 2 || oranges > 10) {
            System.out.println(" Looks like we are good for fruit");
        } else {
            System.out.println("Need to buy some fruit");
        }
                          // false  or       false  = false
        System.out.println(apples == 0 || oranges == 0);

        if(apples ==0 || oranges == 0) {
            System.out.println("We need to purchase more fruits");
        } else {
            System.out.println("We are good for fruit");
        }
































    }
}
