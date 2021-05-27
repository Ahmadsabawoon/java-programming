package day_43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
      // 1 nanosecond = 1_000_000_000 nanoseconds

        //System.out.println(System.nanoTime());
       // System.out.println(GetList());

        long start = System.nanoTime();
        List <Integer> allNumb = GetList();
        long end= System.nanoTime();
        double seconds = (start - end) / 1_000_000_000.0;
        System.out.println("ArrayList Time = " + (start - end));
        //System.out.println(allNumb);
        System.out.println("ArrayList seconds = " + seconds);

        long startArray = System.nanoTime();
        int [] arr = getIntegerArray();
        long endArray = System.nanoTime();
        double seconds1 = (startArray - endArray) / 1_000_000_000.0;
        System.out.println("Array Time = " + (startArray - endArray));
        System.out.println("Array seconds = " + seconds1);
    }

    /**
    Get integer list
    return  list<integer>
    loop from 0 to one million and add to arraylist and than return it
     */

    public static List<Integer> GetList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 1000_000; i++) {
            list.add(i);


        }
        return list;
    }
        /**
         * Get integer Array
         *     return  int
         *     no params
         *     loop from 0 to one million and add to arraylist and than return it
         *
         */

        public static int[] getIntegerArray() {
            //declare empty array with size - 1_000_001
            int[] nums = new int[1_000_001];
            //loop and assign numbers
            for (int i = 0; i <= 1_000_000; i++) {
                nums[i] = i;
            }
            return nums; //return


            /**
             * get days
             */
        }
}
