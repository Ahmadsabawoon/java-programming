package day06_arithmethic_operators;

public class MoreMathOperatores {
    public static void main(String[] args) {
        int toyotas = 431;
        int hondas = 233;
        int vw = 2;
        int nissan = 1;
        int bmw = 155;
        int tesla = 20;
        // totalCarsInParking ->  should equal all of those
        // output: there are 754 cars in parking lot
        int totalCarsInParking= toyotas + hondas + vw + nissan + bmw + tesla;
        System.out.println("There are " + totalCarsInParking + " cars in parking lot " );

        String pizza = "hawaiin";
        int slices = 8;
        int people = 4;

       int slicesPerPerson = slices / people;
       System.out.println("there are " + slicesPerPerson+ " slices per person");

       // there are 2 slices per person

        // we order hawaiin pizza with 8 slices , 4 people ate 2 slices each.
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices," +people + " people " +" ate "+  slicesPerPerson + " slices" + " each");




    }
}
