package day_28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        //break statement :123
        for(int n =1; n <= 5 ; n++) {
            System.out.println(n);

            if(n == 3) {                  // break will print only the numbers mentioned in if statement only the start and end one.
                break;
            }
        }
        System.out.println();
       for (int i = 1; i<=5; i++){
          if (i == 2 || i ==4){
              continue;                   // continue will ignore the number we mention in the if statement part and will not print
              //  and will print only the numbers between the for numbers except the if statement assigned numbers.
          }
           System.out.println(i);

       }











    }
}
