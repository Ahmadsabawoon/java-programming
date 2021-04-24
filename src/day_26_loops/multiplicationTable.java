package day_26_loops;

public class multiplicationTable {
    public static void main(String[] args) {
       int num = 5;
     //  for (int i = 1; i <= 10; i++ ){
        //   System.out.println(num + "x" + i + " = " + (num*i));
      // }

        if(num < 1 || num > 10) {
            System.out.println("Error, Invalid input");
            return;
        }
       int count = 3;
       for (int i = 1; i <= 10; i++) {
           System.out.println(count + " x " + i + " = " + (count*i));


       }




















    }
}
