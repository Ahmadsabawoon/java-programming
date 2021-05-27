package day_31_arrays;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'};


        for (char each : letters) {
            System.out.println(each + " ");

        }

        String sentence = new String (letters);
        System.out.println("\nSentence = " + sentence);


        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length "+ itemArray.length);
        System.out.println("item.length() "+ item.length());

        String [] fruits = {"bananas", "apples", "kiwis", "mango", "papaya", "strawberry"};
        String fruitStr = "";
        for(String mewa : fruits) {
           // System.out.print(mewa + "-");
            fruitStr += mewa + "-";
        }
        System.out.println("\nfruitStr : " + fruitStr);


        String [] languages = {"java", "phyton", "C++", "SQL", "ruby", "JavaScript"};
        System.out.println(String.join("|", languages));
        String joinedLanguages = String.join("<>", languages);
        System.out.println(" joinedLanguages = " + joinedLanguages);


    }
}
