package day_41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {

    // cars list

        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("Mazda");
        myCars.add("ford");
        myCars.add("Mokskvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        // jeep, lada, yugo, toyota, mazda, ford, moksvich, Tesla

        System.out.println(myCars);

        // different way of print it out
        System.out.println(myCars.toString()); // prints all cars
        String allCarsInt1St = myCars.toString(); // saves all cars in 1 string variable

        System.out.println("allCarsInt1St = " + allCarsInt1St);

        // change index 0 to Lamborghini

        myCars.set(0, "Lamborghini");
        System.out.println("after set = " + myCars);

        // change index 4 to Honda
        myCars.set(4, "Honda");
        System.out.println("After set honda = " + myCars.toString());


        /**
         * How would you do that if myCars was array
         * my car[4] = "Honda
         */
        // find the index number of "ford";

        System.out.println("index of ford = " + myCars.indexOf("ford"));

       int moskvichIndex =  myCars.indexOf("Mokskvich");
        System.out.println("moskvichIndex = " + moskvichIndex);

        // change Moskvich to jihuli
        myCars.set(6, "jihuli");  //  myCars.set(Moskvich, "jihuli");
        System.out.println(myCars);

        // replace ford with Trabant
        // indexof("ford"), Trabant

        myCars.set(myCars.indexOf("ford"), "Trabant");
        System.out.println("My cars list after set =  " + myCars);

        // lada -> bugati
        /*
        if my cars contains"lada"
        find index of lada and set value of to bugati
        else print lada is not found
        than the print erray
         */

        if(myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugati");

        } else{
            System.out.println("lada is not found");
        }

        System.out.println("after set bugati = " + myCars.toString());


        /**
         Lamborghini  -> prius
         toyota -> Lexus
         trabant -> Audi
         */

       for ( int i = 0; i < myCars.size(); i++){
           if(myCars.get(i).equals("Lamborghini")) {
               myCars.set(i, "prius");
           } else if(myCars.get(i).equals("toyota")) {
               myCars.set(i, "Lexus");
           } else if(myCars.get(i).equals("trabant")) {
               myCars.set(i, "audi");
           }
       }
        System.out.println("after loop = " + myCars);


    }
}
