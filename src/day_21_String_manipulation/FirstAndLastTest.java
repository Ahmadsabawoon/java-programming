package day_21_String_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word =  "mom";
        char first = word.charAt(0);
        char last  = word.charAt(2);
        if(first == last) {
            System.out.println("first and last letter matched");
        } else {
            System.out.println("first and last letter mismatched ");
        }

        if(word.charAt(0) == word.charAt(2)) {
            System.out.println("first and last letter matched");
        }else {
            System.out.println("first and last letter mismatched ");
        }

        String friend= "aziza";
        if(friend.charAt(0) == friend.charAt(1)) {    // char firstLetter = friend.charAt(0);        // char lastLetter = friend.charAt(1);
            System.out.println("first and last letter matched");
        } else {
            System.out.println("first and last letter mismatched ");

        }
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length()-1);    // int count = friend.length();   // char lastLater = friend.charAt(count-1)
        System.out.println(firstLetter);
        System.out.println(lastLetter);


        if(firstLetter == lastLetter) {
            System.out.println(friend + "- first and last match");
        } else {
            System.out.println(friend + "- first and last mismatch");
        }

        // indexOf(String str, int fromIndex)
        //Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.








    }
}
