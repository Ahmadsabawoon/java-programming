package SelfStudyPractice;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        System.out.println(Arrays.toString(nums));
        
       Arrays.sort(nums);
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        System.out.println("Min value = " + nums[0]);
        System.out.println("Max value = " + nums[nums.length-1]);


        String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "assembly"};

        System.out.println(Arrays.toString(words));

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words
        ));



        int [] num = {900, 49, 40, 123, 400};
        System.out.println(Arrays.toString(num));

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));


    }
}
