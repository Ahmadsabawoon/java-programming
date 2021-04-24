package day13_conditional_statement;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if(isHungry == true) {   // if(ishungry)
            System.out.println("I am hungry I will go get something to eat");
            System.out.println("then code java");
        }else {
            System.out.println("I am not hungry, lets keep coding java");
        }

        double price = 130.44;
        boolean isAffordable = price <= 200.0;  // 200 is budget
        System.out.println("isAffordable = " + isAffordable);
        if(isAffordable ) {
            System.out.println("I can afford it, lets buy it!");
        }else {
            System.out.println("Too expensive , lets keep coding java");
        }

        boolean isRemoteJob = true;
        // if(!isRemoteJob) working with this code also.

        if(isRemoteJob != true) {
            System.out.println("Sorry I am not interested");
        }else {
            System.out.println("Sure I am interested , what is the interview process!");
        }
        //1) using == operator, String city = "fairfax"; print "it is fairfax";   // 2) using equals() method /function, String city = "Los Angeles"; if(city.equals("Los Angeles')) {
        // print " it is LA".

























    }

}
