package day_21_String_manipulation;

public class StringCharAt {
    public static void main(String[] args) {

       // charAt() shows index in a sentence, it mean shows the position of a word in the system.
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
       // System.out.println(word.charAt(4)); // ERROR
        System.out.println(word+ "-" +word.length());

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(1));

        char first = company.charAt(0);
        System.out.println(first);
        char second = company.charAt(1);
        System.out.println(second);
        char third = company.charAt(2);
        System.out.println(third);
        char fourth = company.charAt(3);
        System.out.println(fourth);
        char fifth= company.charAt(4);
        System.out.println(fifth);
        char sixth = company.charAt(5);
        System.out.println(sixth);
        char seven = company.charAt(6);
        System.out.println(seven);
        char eight = company.charAt(7);
        System.out.println(eight);
       //  System.out.println(first + "" + second + "" +third + "" + fourth + "" + fifth + "" + sixth + "" + seven + "" + eight); // This is the right way.


        String withSpaces = first + "" + second + "" +third + "" + fourth + "" + fifth + "" + sixth + "" + seven + "" + eight;
        System.out.println(withSpaces);

    }
}
