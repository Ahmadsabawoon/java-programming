package day12_conditional_statements;

import java.sql.SQLOutput;

public class IfElseStatement {
    public static void main(String[] args) {
        if(10>5) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }


        int count = 25;
        if(count > 25) {
            System.out.println("count is more than 30");
        } else {
            System.out.println("count is less than 30");
        }

        byte age = 25;
        if(age >= 18) {
            System.out.println(" you are eligible to vote");
            System.out.println(" Age is grater or equal to 18");
        } else{
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }



















    }

}
