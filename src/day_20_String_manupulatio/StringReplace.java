package day_20_String_manupulatio;

public class StringReplace {
    public static void main(String[] args) {
        // Replace method in string class
        // it searches in the string and replaces with another string.
        String word = "java";
        word.replace("a","u");
        System.out.println(word);


        String sentence =  "java string are fun";
        System.out.println(sentence);
        System.out.println(sentence.replace("a", "u"));
        System.out.println(sentence.replace("string", "condition"));
        System.out.println(sentence.replace("java ",""));












    }
}
