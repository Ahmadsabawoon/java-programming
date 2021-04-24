package day_32_arrays_split;

import java.util.Arrays;

public class ReverseSentences {
    public static void main(String[] args) {

        String sentence = "java is fun";
        String [] words = sentence.split(" ");
        String reversed = "";
                                                                // 3 - 1 = 2   // 2 - 1 = 1
        // print words array in reverse order
        for (int i = words.length-1; i >= 0; i --) {
            reversed = reversed + words[i] + " ";
            //System.out.print(words[i] + " ");
        }
        System.out.println("sentence = " + sentence);
        System.out.println("reversed = " + reversed.trim());
























    }
}
