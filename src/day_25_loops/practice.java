package day_25_loops;

public class practice {
    public static void main(String[] args) {

        for (int n =  10; n >= 1; n--) {
            System.out.print(n + ", ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        for (int count = 0; count< 50; count++) {
            if(count % 2 == 0) {
                System.out.print(count +", " + "Odd Numbers");
                System.out.println();
            }else if(count % 2 != 0) {
                System.out.println(count + ", " + "Even Number");
            }

        }
        String[] fruits = new String[4];
        fruits[0] = "apples";
        fruits[1] = "pears";
        fruits[2]=  "bananas";
        fruits[3] = "oranges";

        for (int num = 0; num <= 4; num++){
            System.out.println(fruits[num]);
        }






















    }
}
