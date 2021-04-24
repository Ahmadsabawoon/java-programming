package day14_multi_brach_if_statement;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && true);  // true
        System.out.println(true && false);  // false , it should be both side true or false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        System.out.println(10 > 5 && 1 == 1); // true . ture + true = ture
        System.out.println(6 > 5 && 5 < 1);
        System.out.println(3 < 2 && 5>2);
        System.out.println(10 > 15 && 5 > 10);
        
        
        int apples = 10, orange =5;
        boolean check = apples > 5 && orange >3;
        System.out.println("check = " + check);

        if(apples > 6 && orange >2) {
            System.out.println("I have enough apples and orange");
        } else {
            System.out.println("I need to go to walmart to buy some fruit");
        }
        


































    }

}
