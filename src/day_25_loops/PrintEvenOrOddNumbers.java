package day_25_loops;
/*
    int num = 0;
        System.out.print("Even numbers = ");
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print( + i + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("Odd numbers = ");
        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) {
                System.out.print( + i + " ");
 */
public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        // print all even numbers between 1 - 100
        // print all odd number between 1 -100
        System.out.println("Even Numbers 0  -  100: ");
for(int n = 0; n <= 100; n++) {
if(n % 2 ==0) {
    System.out.print(n + " ");
}
}
        System.out.println("\n ODD numbers 0 - 100 : ");
for (int k = 0; k <= 100; k++){
    if(k % 2 != 0){
        System.out.print(k + " ");
    }
}



    }
}
