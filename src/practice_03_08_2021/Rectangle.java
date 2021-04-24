package practice_03_08_2021;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        /*
     - Declare two variables: length and width

         - Calculate the Perimeter 2(l*w)
         - Calculate the Area (w * l)

     - Print properties of the Rectangle

     - Modify to accept Scanner inputs
 */

        // Hard coded values
//        double length = 5;
//        double width = 3;

        // dynamic with Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your length");
        double length = input.nextDouble();
        System.out.println("Enter your width");
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);





















    }
}
