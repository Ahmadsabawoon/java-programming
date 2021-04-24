package day18_condition_practice_strings_intro;

public class Practice {
    public static void main(String[] args) {
        String make = "Audi";
        String model ="A3";
        double leasePrice = 400;
        
        if(make.equals("Audi")) {
            if(model.equals("SQ5")){
                leasePrice = 400;
            } else if(model.equals("A3")) {
                leasePrice = 412;
            }
            System.out.println("Invalid make");
        }

        if (make.equals("Audi") && model.equals("SQ5")) {
            leasePrice = 400;

        }else if (make.equals("Audi") && model.equals("A3")){
            leasePrice = 412;


        }else{
            System.out.println("Invalid make");
        }
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);










        
    }
}
