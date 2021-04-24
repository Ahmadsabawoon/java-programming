package day10_shorhand_operators;

import com.sun.deploy.security.WSeedGenerator;

public class ShortHandOperators {
    public static void main(String[] args) {
    int cars = 10;
    System.out.println("cars in the parking lot = " + cars);
    cars = cars + 2;
    System.out.println("cars in the parking lot = " + cars);
    cars  += 5;
    System.out.println("cars in the parking lot = " + cars);
    // 6 cars left the parking lot
        //   cars -= 6;

    cars -= 3;
        System.out.println("cars in the parking lot = " + cars);

        cars = cars -1;
        cars -= 1;
        System.out.println("cars in the parking lot = " + cars);

        int electricCars = 13;
        cars = cars + electricCars;
        // System.out.println("cars in the parking lot = " + cars);
        cars += electricCars;
        System.out.println("cars in the parking lot  = " + cars);

        String word = "java";
        System.out.println("word = " + word);
        
        word = word + "programming";
        System.out.println("word = " + word);
        // add " is fun
        word += "is fun";
        System.out.println("word = " + word);
        
        String selenium = "but \"selenium\" is more fun";
        word += selenium;
        System.out.println("word = " + selenium);
        
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
         // letter += 'U';
        //System.out.print("letters =" + letter);
        
        double parkingFee = 7.50;
        System.out.println("normal parkingFee is = " + parkingFee);
        // early bird fee to 50 0ff
        //parkingFee = parkingFee / 2;
        parkingFee /= 2;
        System.out.println("early bird parkingFee = " + parkingFee);
        // weekend parking is free
        parkingFee -= parkingFee;
        System.out.println("weekend parkingFee = " + parkingFee);








    }
}



