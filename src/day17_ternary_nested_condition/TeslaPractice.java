package day17_ternary_nested_condition;

public class TeslaPractice {
    public static void main(String[] args) {
        /**
         * char model = 'S';
         * trim -> "Long range"
         *
         *
         * when model 'S'
         *     if trim is "long range":
         *
         *         "range: 412"
         *         "top speed: 155 mph"
         *         "0-60- 3.1sec"
         *     if trim is "Plaid":
         *
         *         "range: 412"
         *         "top speed: 155 mph"
         *         "0-60- 3.1sec"
         *     if trim is "Plaid+":
         *
         *         "range: 412"
         *         "top speed: 155 mph"
         *         "0-60- 3.1sec"
         * when model is '3'
         *
         */
        char model = 'S';
        String trim = "long range";
        int range = 412;
        String topSpeed = "155 mph";

        if(model == 'S') {
            System.out.println("S model is selected for Tesla car");
        if(trim.equals("Long range")){
            System.out.println("Long trim is selected:" + " range is " + range + " and top speed will be " + topSpeed);
        } else if (trim.equals("Plaid")) {
            System.out.println("Cheap one selected and the ");
        }

/*
   if ( model == 'S') {
            System.out.println(model + " Model Selected ");
            if (trim.equals("Long range")) {
                System.out.println("Long range selected:\n range: 412\n Top speed: 155 mph\n Accelerate: 60-3.1 sec ");
            }else if  (trim.equals("Plaid")){
            System.out.println("Medium Model");
            System.out.println("range: 390\n Top speed: 200 mph\n Accelerate: 60-1.99 sec ");
            }else if (trim.equals("Plaid +")){
            System.out.println("Plaid + Model");
            System.out.println("range: 520\n Top speed: 200 mph\n Accelerate: 60-1.99 sec ");
            }else{
            System.out.println("Search Something Else");
        }
        }
 */





        }







































    }
}
