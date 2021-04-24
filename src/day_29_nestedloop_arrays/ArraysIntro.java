package day_29_nestedloop_arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //String[] cities = {"Ashburn","New York", "Fairfax", "Omaha", "Baku"};
        int num = 10;  // single variable
        int[] nums = new int[3]; // arrays variable    1): first way
        // 2): int [] nums = {234, 343, 4566, 5665}; This is easy way to assign the size in short way : in the above example we declare array with
        // size 4 and assigned values in same statement. when we have already data to assign
        // 3): double [] prices = new double[]{10.3, 44.0, 23.99};    || 3): int [] prices = new int[]{10, 44, 23, 99};

        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
        //nums[3] = 100;  // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3

        System.out.println("values at index 0 = " +nums[0]); // index 0
        System.out.println("values at index 1 = " + nums[1]);
        System.out.println("values at index 2 = " + nums[2]);
        System.out.println(Arrays.toString(nums));

        //we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]); //5
        i++;
        System.out.println(nums[i]); //10

        //how to find out the size of the array.
        System.out.println("number of elements = " + nums.length);
        //store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);

        // change values in the array
        nums[0] = 100;
        nums[1]= 300;
        // read the value of index 1 and assign same to index 2
        nums[2] = nums[1];
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);




    }
}
