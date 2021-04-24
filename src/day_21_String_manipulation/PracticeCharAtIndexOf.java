package day_21_String_manipulation;

public class PracticeCharAtIndexOf {
    public static void main(String[] args) {
       String str = "Adam Eye Smith";
       char let1 = str.charAt(0);
       char let2 = str.charAt(5);
       char let3 = str.charAt(9);
        System.out.println(let1);
        System.out.println(let1+let2+let3);

        System.out.println("let1 =" +let1 +"\n" + "let2 =" +let2+"\n" + "let3 = " + let3);
        System.out.println(let1 + let2 + let3 + " " + let1 + let2 + let3);





        // indexOf() practice
        String word = "bobcat";
        String find1 = "b";
        char find2 = 'c';
        System.out.println("The first instance of " + find1 + " is at index::" +word.indexOf(find1));
        System.out.println("The second instance of " + find2 + " is at index::" +word.indexOf(find2));























    }

}
