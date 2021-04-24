package SelfStudyPractice;

public class StringReverseAndPalindrome {
    public static void main(String[] args) {
        // Ex: mom, dad, poop, race car, nurses run

        String original = "race car";    // charAt(i) = so basically we are going to reverse it and counting from last index, in this case a.length()-1 is (3-1) and it
        // means that we are going to minus (i) that its now 2 because already minus from length and now reversing from last index.
        String reverse = "";
        original= original.replace(" ", "");
        for (int i = original.length()-1; i > 0; i--){
            reverse = reverse + original.charAt(i); // reverse += a.charAt(i);
            System.out.println(reverse);

        }
        boolean isPalindrome = true;
        for (int i = 0; i < original.length()-1; i ++) {
            if (original.charAt(i) != reverse.charAt(i)) {
                isPalindrome = false;


            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a palindrome");
        }







    }
}
