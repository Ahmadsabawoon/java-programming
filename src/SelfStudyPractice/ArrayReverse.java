package SelfStudyPractice;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] reverse = {4, 2, 6, 1, 7};

        for(int i = 0; i < reverse.length/2; i++) {
            int temp = reverse[i];
            reverse[i] = reverse[reverse.length-i -1];
            reverse[reverse.length-i -1] = temp;

        }
        System.out.println(Arrays.toString(reverse));



















    }
}
