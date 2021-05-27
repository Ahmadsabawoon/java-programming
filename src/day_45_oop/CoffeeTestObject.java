package day_45_oop;

public class CoffeeTestObject {
    public static void main(String[] args) {

        coffee myCoffee = new coffee();
       // System.out.println("coffee amount = " + myCoffee.amount); not recommended
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill  = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());




        
    }
}
