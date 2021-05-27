package day_42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        // declare String arraylist and add values
        List<String> words = new ArrayList<>();
        words.add("Java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");
      // pass the words list to printStrList method
        printStrList(words);

        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));

        List<Integer> nums = Arrays.asList(23, 54, 2554, 234, 11, 5, 2);
     int sum =  sumIntegerList(nums);
        System.out.println("sum = " + sum);
       
    }
    /**
     methodeName: printStrList
     param: List of strings
     return : void
     print all values separated by space in same line
     */
public static void printStrList(List<String> stringList) {  // imagine has some value "java", "apple", "coffee", "tea"
    for(String str :stringList) {
        System.out.println(str + " ");
    }
    System.out.println();

    /**
     method : sumIntegerList
     param: List of integers
     return int
     calculation sum of integers in the list then returns
     */


}
    public static int sumIntegerList(List<Integer> list) {
    int sum = 0;

    for(int i: list){
        sum +=  i;
    }
return sum;
    }

}