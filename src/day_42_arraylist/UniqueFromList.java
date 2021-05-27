package day_42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        // declare Integer arralist with the following numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6));  // what is unique = it means frequency is only one, means repeated one time.
        System.out.println(nums);
        // new arraylist to store only unique number
    List<Integer> uniqueList = new ArrayList<>();
        // loop through the list
        for(int each : nums){
            // check if number appears only once in the list
           if(Collections.frequency(nums, each) == 1) {
               // print the number
               System.out.println(each + " ");

               uniqueList.add(each);
           }

        }
        System.out.println("\nuniquelist = " + uniqueList);














    }
}
