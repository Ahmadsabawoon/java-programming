package day_24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        char letter = 'z';
        do{
            System.out.print(letter+ " ");
            letter--;
        } while (letter >= 'a');


        int count = 0;
        do{
            System.out.println("Count :" + count);
            count+= 100;
        }while(count <= 1000) ;
            System.out.println("Count:" + count);
















    }
}
