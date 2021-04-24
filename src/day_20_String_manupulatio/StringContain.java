package day_20_String_manupulatio;

import java.util.Locale;

public class StringContain {
    public static void main(String[] args) {
        String word4 = "java";
        System.out.println(word4.contains("v"));  // true
        System.out.println(word4.contains("va")); // true
        System.out.println(word4.contains("ja")); // true
        System.out.println(word4.contains("a")); // true
        System.out.println(word4.contains("jv")); // order method is wrong // wrong
        System.out.println(word4.contains("Ja")); // wrong



        String company = "capital one";
        System.out.println(company.contains("i"));  // true
        System.out.println(company.contains("ital")); // true
        System.out.println(company.contains("l o")); // true
        System.out.println(company.contains("Ca")); // true
        System.out.println(company.contains("na")); // order method is wrong // wrong
        System.out.println(company.contains("tb")); // wrong

        // if company contains space, print "multiple words  company name"
        // else "single word company name"
        if (company.contains(" ")) {
            System.out.println("multiple words company name ");
        } else {
            System.out.println("single word company name");
        }


      String etsyTitle = "Wooden Spoon | Etsy";
        if(etsyTitle.contains(" | ")) {
            System.out.println("pass - title check ");
        } else {
            System.out.println("failed - Title check ");
        }

        String firstName = "Ahmad";
        if(firstName.contains("A")  && firstName.contains("d")) {
            System.out.println("both a && e are present");
        }else {
            System.out.println("failed - checked");
        }

        firstName = "Nadir";
        if (firstName.contains("N") || firstName.contains("i")) {
            System.out.println("both (N) || (i) is present");
        } else {
            System.out.println("failed - checked");
        }

        String email = "seYarkhan143@gmail.com";
        if(email.contains("seya")  && email.endsWith(".com")) {
            System.out.println("Valid email");

        }else {
            System.out.println("Invalid Email");

       }

        // Case insensitive, goes from left to right. first convert to lowercase, the check if "y" is present.
        if(email.toLowerCase().contains("y")) {
            System.out.println("y is present ");
        } else{
            System.out.println("y is not present");
        }















    }
}
