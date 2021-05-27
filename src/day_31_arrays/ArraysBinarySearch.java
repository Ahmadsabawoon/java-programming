package day_31_arrays;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        int [] nums = {33, 40, 55, 123, 400};

        System.out.println(Arrays.binarySearch(nums, 55));
        System.out.println(Arrays.binarySearch(nums, 400));
        System.out.println(Arrays.binarySearch(nums, 40));
        System.out.println(Arrays.binarySearch(nums, 300));


        // check if number 400 is among number in array

        if (Arrays.binarySearch(nums, 400) >= 0) {
            System.out.println("400 is present in array");
        } else {
            System.out.println("400 is not present");
        }


       //  What is binary Search
        //   binary search will give you the index number of element / you have to mentioned the variable name and than the value number.

        System.out.println(Arrays.binarySearch(nums, 40));





















    }
}
