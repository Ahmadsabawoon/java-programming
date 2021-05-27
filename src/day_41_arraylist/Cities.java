package day_41_arraylist;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {

      // declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        // add values to array list -> add methods

        cities.add("San Diego"); // o   indexes
        cities.add("Afghanistan"); // 1
        cities.add("Vienna");  // 2
        cities.add("LA"); // 3
        cities.add("Adana"); // 4
        cities.add("Bamyan");

        // add Ashgabat to array list
        cities.add(0,"Ashgabat");
        // print all values in same line
        System.out.println(cities);
        // print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("Last city =  " + cities.get(4));
        System.out.println("Middle city = " + cities.get(2));

        // find last index use size()-1 method
        System.out.println("last city = " + cities.get(cities.size()-1));
        // print count of item in arraylist
        System.out.println("count of items = " + cities.size());
        System.out.println("Last City = " + cities.get(5));
        System.out.println("Last city = " + cities.get(cities.size()-1));


        int size = cities.size();
        System.out.println("size = " + size);

        // for loop and print all values in same line
        for (int i = 0; i < cities.size()/2; i++) {
            System.out.print(cities.get(i) + " ");

        }

        for(String city : cities) {
            System.out.println(city + " ");
        }

        // delete or remove arraylist
        // 1) remove using index. delete value at index 0
        cities.remove(0);
        // 2) remove using object / value
        cities.remove("Ashgabat");


        System.out.println("after remove = " + cities);

        // delete/ remove all values from list
        cities.clear();

        // make sure it is clear
        // 1) print/split it out
        System.out.println("After clear everything = " + cities);

        // 2) using isEmpty
        if(cities.isEmpty()) {
            System.out.println("list is Empty");
        }

        // 3) check size() == 0
        if(cities.size() == 0) {
            System.out.println("list is empty");
        }











    }
}
