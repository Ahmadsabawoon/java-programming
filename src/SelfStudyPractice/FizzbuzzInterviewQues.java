package SelfStudyPractice;

public class FizzbuzzInterviewQues {
    public static void main(String[] args) {
        // write a number from 1 to 100
       for(int i = 0; i <= 100; i++) {
           if (i % 3 == 0) {
               System.out.println("fizz");
           } else if (i % 5 == 0) {
               System.out.println("Buzz");
           }else if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
           }else {
               System.out.println(i);
           }
       }


    }
}
