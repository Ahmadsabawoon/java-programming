package day_41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArraysAsList {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
        // nums.add(100);
        // nums.remove(0); Not working , The reason when we use Arrays.asList it will return immutable(can not changed) list, that size cannot be modified. but we can do any other operations on it.
        // nums.clear();

        List<Integer> numsList = new ArrayList<>(Arrays.asList(23, 1, 34, 54));
        System.out.println(numsList);
        numsList.add(55);
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23)); // when we add new integer its removing the mention number not the index
        System.out.println("numsList = " + numsList);

        /**
         List string drinkWithCaffeine -> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha, celcius.
         int caffeineAmount = 150
         String drink = "monster
         monster, red bull, celcius
         caffeineAmount = 75
         coffee, kambucha:
         caffeineAmount = 112
         tea, cake, pepsi, mdew:
         caffeineAmount = 35
         */

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew",  "kambucha","celsius" ));

        System.out.println(drinksWithCaffeine);
        int caffeineAmount = 0;

        for (String drink : drinksWithCaffeine) {
            if(drink.equals("monster") || drink.equals("red bull") || drink.equals("celcius")) {
                caffeineAmount = 150;
                System.out.println(drink + " --> " + caffeineAmount);
            } else if (drink.equals("coffee") || drink.equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(drink + " --> " + caffeineAmount);
            } else if(drink.equals("tea") || drink.equals("cake") || drink.equals("pepsi") || drink.equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(drink + " --> " + caffeineAmount);
            }
        }


        for (String drink : drinksWithCaffeine) {
            switch (drink) {
                case "monster": case "red bull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink+ " --> " + caffeineAmount);
                    break;
                case "tea": case "coffee": case "kombucha":
                    caffeineAmount = 112;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                case "coke": case "pepsi":  case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
            }
        }

        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase(Locale.ROOT)));

        drinksWithCaffeine.forEach(each -> {
            System.out.println("-------");
            System.out.println("each = " + each);
            System.out.println("-------");
        });
    }
}
