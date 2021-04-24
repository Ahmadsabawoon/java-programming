package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {
        // byte - short - int - long
        byte num1 = 100;
       short nun2 = num1;
       int num3 = num1;
       int num4 = 1000;
       long num5 = num4;
       float num6 = 124.4F;
       double num7 = num6;

       int num8 = 3456;
       double num9 = num8;
       System.out.println(num8);
       System.out.println("num9 = " + num9);
       // Explicit casting examples:
        // byte - short - int - long
        // int num1 = 55;      byte num2 = num1  / this line error and need casting . int is larger that byte.
        // byte num2 (byte)num1

        System.out.println("================================");

        int num10 = 22;
        byte num11 = (byte)num10;
        short num12 = (short)num10;

        System.out.println("num10 = " + num10);
        System.out.println("num12 = " + num11);
        System.out.println("num12 = " + num12);

        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);

        double num15 = 1234.5;
        int num16 = (int)num15;

        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);

        int num17 = 300;
        byte num18 = (byte)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);


        char letter = 'A';
        int numLetter = letter;
        System.out.println("letter = " + numLetter);
        System.out.println("letter = " + letter);
        // note: if you remember char also has number associated to it.
        // 'a' -> 97..
        // if you assign char variable int int. that number will be assigned.

        // casting primitive: we can cast primitive from one to another. from smaller to larger -> automatic casting conversion.
        // from larger to smaller-> explicit casting, we need to use().
        // boolean not casting
        int num = (int)1234.4 ;

        // int num = 44;       double d = num;     44.0
        // when we cast , convert whole number to double it will add 0. .













    }
}
