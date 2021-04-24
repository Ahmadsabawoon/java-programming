package day_32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {

        String sentence = "java is fun";
        String [] words = sentence.split(" ");
        System.out.println("1 st word = " + words[0]);
        System.out.println("2nd word = " + words[1]);
        System.out.println("third word = " + words[2]);
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        String googleResults = "About 1,810,000 results (0.68 seconds)";
        String [] googleWords = googleResults.split(" ");
        System.out.println("Results : " + googleWords[1]);
        System.out.println("Results : " + googleWords[3].replace("(",""));
        System.out.println("Results : " + googleWords[3].substring(1));






















    }
}
