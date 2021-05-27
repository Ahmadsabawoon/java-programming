package day_45_oop;

public class ComparingString {
    public static void main(String[] args) {
        String word1 = "java"; // in string pool
        String word2 = "java"; // re - use from string pool
        String word3 = new String("java"); // creat in HEAP, outside String pool
        String word4 = new String("java"); // creat in HEAP, outside String pool

        System.out.println(word1 == word2); // TRUE - points to same object in pool
        System.out.println(word1 == word3); // FALSE - points to different object
        System.out.println(word3 == word4); // FALSE -> point to different object in Heap


        System.out.println(word1.equals(word2));
        System.out.println(word2.equals(word3));
        System.out.println(word3.equals(word4));
    }
}
