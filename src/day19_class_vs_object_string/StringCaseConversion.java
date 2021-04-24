package day19_class_vs_object_string;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word ="Cybertek";
        String sentence = "Ahmad Is A great GUY";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);

        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";  //   //
        company = company.toUpperCase();
        System.out.println("Company = " + company);
        System.out.println(company.toUpperCase());
        System.out.println("Company in uppercase -" + company.toUpperCase());
        System.out.println("java" .toUpperCase());
        
        
        // change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
















    }
}
