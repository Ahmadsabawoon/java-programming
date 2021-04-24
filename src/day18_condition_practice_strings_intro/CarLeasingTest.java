package day18_condition_practice_strings_intro;

import com.sun.crypto.provider.HmacMD5KeyGenerator;

public class CarLeasingTest {
    public static void main(String[] args) {
       String make = "mercedes";
      String  model = "E";
      double leasePrice = 0.0;



        if (make.equals("mercedes") && model.equals("E")) {
            System.out.println( "model is - " +model );
            leasePrice =  500.0;

        } else if (make.equals("mercedes") && model.equals("A")) {
            System.out.println(model + " is model");
            leasePrice = 400.0;
        }
        System.out.println("leasePrice = " + leasePrice);
        System.out.println("model = " + model);
        System.out.println("make = " + make);

       // This code is doing the same think and is called nested.
        if(make.equals("mercedes")){
            if(make.equals("E")){
                leasePrice= 500.0;
            }else if(model.equals("A")){
                leasePrice = 400;
            }
            System.out.println("Invalid make");


        }

        }
}
