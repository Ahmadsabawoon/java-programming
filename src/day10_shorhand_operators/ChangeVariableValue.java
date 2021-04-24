package day10_shorhand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        double fuelPrice = 2.75;
        fuelPrice = fuelPrice +1.0;
        // we will increase by 1 dollar
        System.out.println("fuelPrice = " + fuelPrice);
        int count = 3;
        count = count - 2;
        System.out.println("count = " + count);
        int apples = 15;
        apples = apples - 3;
        System.out.println("apples = " + apples);
        
        int pizzaSlices = 8;
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices +8;
        System.out.println("pizzaSlices = " + pizzaSlices);

        int players = 10;
        System.out.println("players: " + players);
        // double the players to start the match
        players = players *2;
        System.out.println("players = " + players);






  }
}









