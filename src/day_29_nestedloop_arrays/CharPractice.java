package day_29_nestedloop_arrays;

public class CharPractice {
    public static void main(String[] args) {
        char ch = 'A';
        int n = ch;
        System.out.println("Ascii value of "+ch+" will be " +n);

        char capitalChar = 'A';
        char smallChar = 'a';
        // write a program ti find the ascii value from A_Z

        for ( int i = 'A'; i <= 'Z'; i++) {
            System.out.println(capitalChar + ":" + i);
            capitalChar++;

        }
        for ( int i = 'a'; i <= 'z'; i++) {
            System.out.println(smallChar + ":" + i);
            smallChar++;


        }


    }
}
