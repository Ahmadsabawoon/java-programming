package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? = " + isSpeeding);
        System.out.println(currentSpeed>speedLimit);
        System.out.println(speedLimit<currentSpeed);
        System.out.println(speedLimit == currentSpeed);
        System.out.println("currentSpeed = " + currentSpeed +" mph");
        System.out.println("SpeedLimit = " + speedLimit + " mph");

        currentSpeed += 20;

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? = " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed +" mph");
        System.out.println("SpeedLimit = " + speedLimit + " mph");

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("can I afford? - " + (accountBalance >= itemPrice));
        System.out.println(itemPrice <= accountBalance);
        
        boolean canAfford = accountBalance >= itemPrice ;
        System.out.println("canAfford = " + canAfford);

        // decrease balance by itemprice. using shorthand operator.
        accountBalance -= itemPrice;
        accountBalance = accountBalance - itemPrice;

        boolean isBroke = accountBalance <=0;
        System.out.println("Am I Broke? - " + isBroke);





        














































    }
}
