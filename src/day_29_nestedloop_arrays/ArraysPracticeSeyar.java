package day_29_nestedloop_arrays;

public class ArraysPracticeSeyar {
    public static void main(String[] args) {
        String [] names = {"john", "Adam", "Don"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("names " + names[i]);

        }
        String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};
        String zombies [] = {"Close-range", "Mid-range zombie", "Long-range zombie"};
        int[] numbersZombiesHate = {4, 90, 70, 123, 12, 4, 561, 1 };

        System.out.println("Backpack items!");
        System.out.println(backpack[0]);
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);
        System.out.println("---------------------------------");

        System.out.println("These are the zombies!");
        System.out.println(zombies[0]);
        System.out.println(zombies[1]);
        System.out.println(zombies[2]);
        System.out.println("---------------------------------");

        System.out.println("What number Zombies hate mostly!");
        System.out.println(numbersZombiesHate[6]);


        // 2D Arrays:
        int [] [] lotteryCard = {{20, 15, 7},
                {8, 7, 19},
                {7, 13, 47}
        };














    }
}
