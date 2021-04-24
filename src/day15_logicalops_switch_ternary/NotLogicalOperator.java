package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;
        // check if age in not more than 7 .
        if(!(age > 7)) {
            System.out.println("Need to sit in child care seat . age + " +age);
        } else {
            System.out.println("Can sit in normal seat. age + " +age);
        }

        boolean isSmokingAllowed = false;
        // if smoking is not allowed : print " smoking is now allowed here.
        if (!isSmokingAllowed) {
            System.out.println("smoking is now allowed here. Exit");
        }


        boolean isAffordable = true;
        if(!isAffordable) {
            System.out.println("Item Not affordable");
        }

        String env =  "qa";
        if (!env.equals("qa")) {
            System.out.println("In wrong environment for qa testing");
        }

        String carModel = "Tesla";
        if(!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if(!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }
        if(!inputPassword.equals(secretPassword)) {
            System.out.println("correct password");
        } else {
            System.out.println("Incorrect password");
        }





























    }
}
