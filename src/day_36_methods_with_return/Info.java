package day_36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        fullName();
        System.out.println("Full Name: " + fullName()) ;
        System.out.println("is Married: " + isMarried());
        System.out.println("My age is :" + age());
        System.out.println("what is your? " + fullName() + "."+  " Are you married ? " + isMarried() + "." + " what is your age then? " + age() + " years old and I want to get married soon.");
       //int random =  getRandomYear();
        //System.out.println(random);
        System.out.println("Birth year: " + getRandomYear());  // dynamic . different year each time
        String name = fullName();
        boolean married = isMarried();
        int age = age();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if(isMarried()) {
            System.out.println("married");
        }else{
            System.out.println("single");
        }
    }

    public static String fullName(){
        System.out.println("Inside full name method");
        return ("mike smith");
    }
    public static boolean isMarried(){
        return (false);
    }
    public static int age(){
        return (29);

    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }


}
