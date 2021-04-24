package day_30_arrays;

import java.util.Locale;

public class StudentArrays {
    public static void main(String[] args) {
       /*
        String[][] StudentInformation = {{"firstname", "lastName", "batchNum", "phoneNum"},
                {"Ahmad", "Sabawoon", "Nasim", "Abbas"},
                {"12345", "73563", "16726", "14266"},
                {"6199228278", "6199228279", "6199228275", "6199228270" }
        };
                for(int i = 0; i < 3; i++){
                    System.out.println(StudentInformation[i][i]);
                    for (int j =0; j < 3; j++){
                        System.out.println(StudentInformation[i][j]);
                }
                }
        */
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";

        String[] student2 = {"MK4421" , "Mike", "Bloomberg", "B22" , "703-432-1234"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2] );
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 mobile num = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        //check if student1 data array contains 5 items.
        // true: PASS: data array has correct length
        //false: FAIL: data array has incorrect length

        /**
         check if student1 and student2 arrays have same number of data
         TRUE: PASS: data arrays length match
         FALSE: FAIL: data arrays length mismatch
         */

        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }
        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data arrays length mismatch");
        }

        System.out.println(student1[1].toUpperCase() +" "+  student1[2].toUpperCase());
        String mobileNum = student1[4];
        System.out.println(mobileNum);
        System.out.println(student1[1].length());






    }
}
