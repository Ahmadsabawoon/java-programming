package day_33_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {

        String word = "javaknjava";
        String [] array = word.split("a");
        System.out.println(array.length);

        int countOfA = array.length-1;
        if(word.endsWith("a")) {   /// if ends with a, add one more
            countOfA++;

        }

        System.out.println("count of A = " + countOfA);


//        System.out.println("---------Split with Empty String-------------");
//        String [] Str = word.split("");
//       // System.out.println(Array.toString(Str));

        String word1 = "java1sql2ht3ml";
        String[] strArr2 = word1.split("\\d");
        System.out.println(Arrays.toString(strArr2));
        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }













    }
}
