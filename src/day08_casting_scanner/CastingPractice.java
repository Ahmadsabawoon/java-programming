package day08_casting_scanner;

public class CastingPractice {
    public static void main(String[] args) {
        // byte -> short -> int -> float -> double
        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (int)d;
        int i2 =(int)d;

        float f = 3.54F;
        float f2 = (float)3.54;  // float = double
        float f3 =5; // float = int -> 5.0
        float f4 = 5.5F; // float = double
       // System.out.println((double)l);













    }
}
