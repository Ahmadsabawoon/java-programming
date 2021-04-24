package day07_arthimatic_operating_costing;

public class DivisionProblem {
    public static void main(String[] args){
        System.out.println(10 / 3);
        System.out.println(5 / 2);
      int num1 = 40;
      int num2 = 15;

        System.out.println(num1 / num2);

        System.out.println(5.0 / 2.0);
        System.out.println(5.0 / 2);
        double d1 = 12.0;
        double d2 = 5.0;
        System.out.println(d1 /d2);

        int count = 100;
        double dCount = 30.0;
        System.out.println(count / dCount);
        // primitive casting:
        // primitive conversion:

       // int n1 = 4;
       // byte b1 = n1;
        // the above line will show error , because int is larger date type than byte. even though the value is only 4.
        // in order to make it work, we need to cast it.
        int n1 = 4;
        byte b1 = (byte)n1;
        // now the above line (byte)n1 will cast/convert n1 to byte, than assign the value.
        byte b2 = 55;
        int n2 = b2;
        // the above statement will work fine.







    }
}
