package day_25_loops;

public class printStars {
    public static void main(String[] args) {
        for(int stars =1; stars <= 15; stars++){
            System.out.print("* ");
        }
        System.out.println();
        String myStars= "";

        for(int stars = 1; stars<= 5; stars++ ){
          myStars += "* ";

        }

        System.out.println("My stars = " + myStars);

        for(int dashes = 50; dashes <= 100; dashes++){
            System.out.println();
        }










    }
}
