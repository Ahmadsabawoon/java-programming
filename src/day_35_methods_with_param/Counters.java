package day_35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(4);
        count(12);
        int num2 = 999;
        count(num2);
        String word = "wooden Spoon";
        count(word.length());
        printAge(1993);
        int birthYear = 2001;
        printAge(birthYear);
        evenOddNumber(12, 14);

    }

    public static void count(int num){
        for(int i = 0; i <=num; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printAge(int year){
        int age = 2021-year;
        System.out.println("Birth year : " + year + ". Age:" + age);

    }
    public static void evenOddNumber(double num1, double num2) {

    }
}

