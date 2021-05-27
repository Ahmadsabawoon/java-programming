package SelfStudyPractice;

import java.util.Arrays;

public class StringBuildSame {
    public static void main(String[] args) {
        String a = "abc";
        String b = "cab";
        char [] ch1 = a.toCharArray();
        char [] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(b);


    }
}
