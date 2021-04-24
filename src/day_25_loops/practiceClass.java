package day_25_loops;

public class practiceClass {
    public static void main(String[] args) {
        int count = 5;
        for(int i = 0; i < count; i++) {
            for(int k = 0; k < count; k++) {
                System.out.print("* * * * ");
                for(int l = 0; l < count; l++) {
                    System.out.print("----");
                }
            }
            System.out.println();
        }
    }
}
