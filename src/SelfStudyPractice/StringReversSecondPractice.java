package SelfStudyPractice;

public class StringReversSecondPractice {
    public static void main(String[] args) {
        String completeName = "Ahmad Sabawoon";
        String reverse = "";


        for (int i = completeName.length()-1; i >=0; i--){
            reverse = reverse+ completeName.charAt(i);
            System.out.println(reverse);

        }
        boolean isPalindrome = true;

        for (int i = 0; i <= completeName.length()-1; i++) {
            if(completeName != reverse){
                isPalindrome = false;

            }
        }
       if (isPalindrome){
           System.out.println("Palindrome");
       }else{
           System.out.println("Is not a palindrome ");
       }

    }
}
