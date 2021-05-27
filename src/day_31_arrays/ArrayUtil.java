package day_31_arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtil {
    public static void main(String[] args) {

/*
[fast way to get max from array is sort the get then last element]
"
int nums[] = {5, 1, 5, 8, 778, 56, 3};
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        System.out.println(max);
"
 */

        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};
        //print all nums in same line
        System.out.println(Arrays.toString(nums));

        //sort nums. re-arrange values in ascending order
        Arrays.sort(nums);
        //print after sorting
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);

        //Arrays.sort(nums, Collections.reverseOrder());

        String[] words = {"Java", "C#", "C++", "Kotlin", "Python", "Ruby", "assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ", words)+"]");

        //sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort words in reverse order
        Arrays.sort(words, Collections.reverseOrder());

        System.out.println(Arrays.toString(words));
    }

}
