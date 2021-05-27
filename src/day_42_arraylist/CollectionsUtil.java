package day_42_arraylist;
import day_41_arraylist.ArraysAsList;
import practice_05_03_2021.CountLetters;

import java.sql.ClientInfoStatus;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("Size = " + letters.size());
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println("reversed = " + letters);
        letters.add('a');
        System.out.println(letters);
        letters.set(letters.indexOf(('a')), 'a');
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println(letters);


        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));


        Collections.replaceAll(letters,'a', 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("after replace all = " + letters);
        Collections.sort(letters);
        System.out.println(letters);


        List<Integer> nums = Arrays.asList(23, 1, 5, 78, 99, 99, 1, 4, 6, 5, 5, 5, 5);

        Collections.reverse(nums);
        System.out.println("Numbers after reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        int countOfFives = Collections.frequency(nums, 5);
        System.out.println("countOfFives = " + countOfFives);

        int countOfOnes = Collections.frequency(nums, 1);
        System.out.println("countOfOnes = " + countOfOnes);

        Collections.replaceAll(nums, 5, 50);
        System.out.println("after replace all nums  = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("After reverse sort = " + nums);

        Collections.shuffle(nums);  // shuffle changed around
        System.out.println("After shuffle = " + nums);
















    }
}
