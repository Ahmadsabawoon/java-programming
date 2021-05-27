package day_41_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        // for ArrayList we use collection.sort
        // for Arrays = Arrays.sort

        List<Integer> nums = new ArrayList<>();
        nums.add(3); nums.add(120); nums.add(1);
        System.out.println("Number before sort: " + nums);

        Collections.sort(nums);
        System.out.println("after sorting: " + nums);

        List<String> Names = new ArrayList<>();
        Names.add("B Ahmad");
        Names.add("A Sabawoon");
        Names.add("C Erfan Khan Sabawoon");
        Collections.sort(Names);
        System.out.println(Names);






    }
}
