package practice_04_06_2021;

public class LongestSubstring {
    /*
       Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee Output: ccccc
        */
    public static void main(String[] args) {
    String str = "aaabbbcccccddddee ";
    String longestSubString ="";
    String temp = "";

    for(int i = 0; i < str.length()-1; i++) {


        temp += str.charAt(i);

        if(str.charAt(i) != str.charAt(i +1)) {

            if(temp.length() > longestSubString.length()) {
                longestSubString = temp;
            }

            temp = "";


        }

    }

        System.out.println("Longest substring " + longestSubString);




















    }
}
