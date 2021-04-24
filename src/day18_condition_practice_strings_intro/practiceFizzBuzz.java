package day18_condition_practice_strings_intro;

public class practiceFizzBuzz {
    public static void main(String[] args) {
        // if multiple of 3, print "fizz'
        // if multiple of 5, print "buzz"
        // if multiple pf 5 && 3, print "fizzbuzz"
        int number = 15;
        if(number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        }else if (number % 5 == 0){
            System.out.println("Fizz");
        }else if (number % 3 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(number);
        }
























    }

}
