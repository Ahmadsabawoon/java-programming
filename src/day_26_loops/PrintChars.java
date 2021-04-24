package day_26_loops;

import java.util.Locale;

public class PrintChars {
    public static void main(String[] args) {

        String word = "Java";
        for(int i = 0; i < word.length(); i++){
            System.out.println(i + " "+ word.charAt(i));

        }
        word = "java";
        for(int i = word.length()-1; i >= 0 ; i--) {
            System.out.println(i + " " + word.charAt(i));
        }

        /**
         * Long way, without loop.
         *  System.out.println(word.length());
         System.out.println(word.charAt(0));
         System.out.println(word.charAt(1));
         System.out.println(word.charAt(2));
         System.out.println(word.charAt(3));
         System.out.println(word.charAt(4)); ERROR
         */

    }
}
