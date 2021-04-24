package day18_condition_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
     String todayClass = "python";
     if(todayClass.equals("Java"))
         System.out.println("Java is fun");

     else
         System.out.println("it is not java. it is  " + todayClass);
     // zero percent of advantage not using curly braces

        int score = 1;
        if (score == 1) {
            System.out.println("Lowest score 1");
        } else if (score == 2) {
            System.out.println("score is 2");
        } else if (score == 3) {
            System.out.println("score is 3");
        } else {
            System.out.println("Invalid score");
        }


        int a = 1;
        if(a == 1) {
            System.out.println("a is 1");
            System.out.println("1 is a");
        }





























    }
}
