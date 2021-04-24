package day07_arthimatic_operating_costing;

public class StringConcatPractice {
    public static void main (String [] args){
        System.out.println(5+3 + "Java");
        System.out.println("Java " +  (5+3)); //if 5+3 is not written in the bracket then the print will be Java53

        String str1 = "Hello";
        String str2 = "Friends";
        System.out.println(str1 + "\t\t " + str2);
        System.out.println(5 + 3 + "Java");
        System.out.println("Java" + 5 + 3 );
        System.out.println("Java" + (5+3));

        // empty Strings : String word = ""; word has empty space value now.
        // " " space
        // "" empty
        System.out.println(5 + " " +5);
        System.out.println(5 + "" +5);
        System.out.println(5 + " " +5);
        char char1 = 'a';
        char char2 ='b';
        System.out.println(char1+char2); // when we plus between chars it calculated the ASCII numbers.
        System.out.println(char1 +""+ char2);
        //  than this will print the int characters for us.
        // OPERATOR PRECEDENCE
        // ORDER OF OPERATIONS.
        // * Calculated first
        // +  calculated after if you haze them in same line.
        // 5+2*3 _> 11
        // 2*3--> 6
        //5+6--> 11
        // we can anytime use parenthesis to override the precedence.
      //   (5+2) * 3_> 21







    }
}
