package day_29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {

        for(int minute = 1; minute <= 10; minute++){
            System.out.println("\nminutes = " + minute);
            for(int second = 1; second<= 60; second++){
                System.out.print( second + " ");
            }
        }
        /*
        0:1
        0:2
        0:45
        1:0
        1:1
        1:2
        ....
         */
        for(int minutes =0; minutes <= 4; minutes++){
            for(int seconds =0; seconds<= 60 ; seconds++){
                System.out.println(minutes + ":"+ seconds);
               // Thread.sleep(1000);

            }
        }























    }

}
