package SelfStudyPractice;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String appWords = "Ahmad is a great guy and - he is - the - best - man== khan == man";

        String [] Split = appWords.split("-");
        System.out.println(Arrays.toString(Split));
//        String [] Split1 = appWords.split(" ");
//        System.out.println(Arrays.toString(Split1));
        System.out.println(Split.length);






















    }
}
