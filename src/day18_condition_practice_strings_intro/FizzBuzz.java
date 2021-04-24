package day18_condition_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {
   int number = 15;
   if(number % 3 == 0 && number % 5 == 0){
       System.out.println("fizzbuzz");
   } else if(number % 3 == 0) {
       System.out.println("fizz");
   } else if (number % 5 == 0) {
       System.out.println("buzz");
   } else {
       System.out.println(number + " Not fizzbuzz");
   }














    }
}
