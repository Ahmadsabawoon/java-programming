package SelfStudyPractice;

public class SwappingInJavaProject {
    public static void main(String[] args) {

        // Logic1 for Swapping Numbers in coding

        // for this logic we are assigning a new variable, it means third variable(Temporary)
        // Remember the only use of temporary is to held the value of first before swapping

        int a = 20, b= 40;

        int temp = a;   //20
        a = b;         // 40  ------> a = 40
        b = temp;      // 20 -------> b = 20

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // Logic 2 for swapping number in coding

        // Using the arithmetic operators (adding and subtraction).

        a = a + b;     // ---> a = 20 + 40 = 60
        b = a - b;     // ---> b = 60 - 40 = 20
        a = a - b;     // ---> a = 60 - 20 = 40

        // a = 40
        // b = 20
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
