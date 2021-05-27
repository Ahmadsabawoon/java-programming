package SelfStudyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionPractice {
    public static void main(String[] args) {

        List <Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        System.out.println("nums = " + nums);
         List<Integer> uniqueList = new ArrayList<>();

         for (int each : nums) {
             if(Collections.frequency(nums, 2) == 1 ){
                 System.out.println("It is frequency number");


                 uniqueList.add(each);

             }
         }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
