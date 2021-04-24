package day_40_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
       ArrayList<Integer> nums = new ArrayList<>();
       nums.add(5);
       nums.add(7);
       nums.add(11);
       // nums.add("java"); ERROR
        System.out.println("Size = " + nums.size());
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));
      //  System.out.println("index 0 = " + nums.get(3)); // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 3

        // Print all values in same line
        System.out.println(nums);  // Arrays.toString(numArray) is with only array but with arraylist is just calling in the print and printed easily.
        nums.remove(1); // remove element at index 1
        System.out.println(nums);

//        nums.remove(0);
//        System.out.println(nums);


    }
}
