package day_22_string_manipulation;

public class StringSubString {
    public static void main(String[] args) {

        String word = "hello";
        System.out.println(word.substring(0,3));
       System.out.println(word.substring(1,4));
        System.out.println(word.substring(2,4));
        System.out.println(word.substring(1,3));
        System.out.println(word.substring(0));
        System.out.println(word.substring(2));
       System.out.println(word.substring(4));
        System.out.println(word.substring(5));


       String word1 = "java is fun";
        System.out.println(word1.substring(0,4));
        System.out.println(word1.substring(0,7));
        System.out.println(word1.substring(5,7));
        System.out.println(word1.substring(8,11));
        /**
         * 2) substring (startIndex) - it will read from start until end
         */

        System.out.println(word1.substring(8));
        System.out.println(word1.substring(5));
        System.out.println(word1.substring(1));















    }
}
