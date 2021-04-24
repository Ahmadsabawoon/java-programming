package day_39_wrappers_classes;

public class WrapperClassMethod {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


        System.out.println(Double.max(234.4,23.9));
        System.out.println(Double.min(345.5,657.4));
        System.out.println("MIN DOUBLE : " + Double.MIN_VALUE);
        System.out.println("MAX VALUE : " + Double.MAX_VALUE);

         // Compare can return 3 values 1, 0, -1
        System.out.println(Double.compare(5,1)); // 1. first larger than second
        System.out.println(Double.compare(5,5)); // 0 - if equal numbers
        System.out.println(Double.compare(5,45)); // -1. first is smaller than second

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('V'));
        System.out.println(Character.isAlphabetic('A'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isLetter('9'));

        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("its uppercase");
        }


        String word = "JaVa iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                System.out.println(word.charAt(i));
            }
        }

        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE.equals(5 > 3));









    }
}
