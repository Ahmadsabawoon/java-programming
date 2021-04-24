package day_25_loops;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter Start number: ");
        int start = scan.nextInt();
        System.out.println("Enter End number: ");
        int end = scan.nextInt();

        for (int i = start; i <= end;i++) {
            System.out.println(i);
            if (start>end){
                System.out.println("Reverse numbering is not supported");
            }
        }

        /*
            public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end");
        int start = scan.nextInt();
        int end = scan.nextInt();

        if(start > end) {
            System.out.println("reverse numbering is not supported");
        }

        for(int i = start; i <= end; i++) {
            System.out.print(i+" ");
        }
         */
















    }
}
