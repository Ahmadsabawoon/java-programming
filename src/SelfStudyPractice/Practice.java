package SelfStudyPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(22, 44, 55, 55, 55, 55));
        int sum = 0;

        for (int inter : list) {
            sum = sum + inter;
        }
        System.out.println(sum);





    }
}