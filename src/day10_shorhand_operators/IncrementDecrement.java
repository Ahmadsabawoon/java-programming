package day10_shorhand_operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        //int num = 10;
       // num = num +1;          all of these statement above are adding 1 to the value of num.
       // num += 1;
       // num++;
       // ++num;
        int i = 10;
        System.out.println("i = " + i);
        i = i +1;
        System.out.println("i = " + i);
        i += 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        ++i;
        System.out.println("i = " + i);

        int linesOfCodes = 15;
        System.out.println("linesOfCodes " + linesOfCodes);
        linesOfCodes = linesOfCodes +1;
        System.out.println("linesOfCodes = " + linesOfCodes);
        linesOfCodes++;
        System.out.println("linesOfCodes = " + linesOfCodes);
        ++linesOfCodes;
        System.out.println("linesOfCodes = " + linesOfCodes);
        linesOfCodes += 1;
        System.out.println("linesOfCodes = " + linesOfCodes);
        // ++ linesOfCodes++ = is Error.
        
        // type 4 different ways of decreasing by 1
        int linesOfCode = 15;
        linesOfCode = linesOfCodes -1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode -= 1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode--;
        System.out.println("linesOfCode = " + linesOfCode);
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        
        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++; // change to next character
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        letter--;letter--;letter--;
        System.out.println("letter = " + letter);

    }
}
