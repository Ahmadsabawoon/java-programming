package day16_switch_ternary;

public class AdaireApartment {
    public static void main(String[] args) {
        System.out.println("========== Welcome to the Adaire apartments ========");
        int numberOfBedrooms = 0; // 1,2
        double startingPrice = 0;

        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1453;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
               startingPrice = 2899;

               break;
            default:
                System.out.println(numberOfBedrooms +" bedroom are not available right now");
                // return : turn off the main method and last part


        }
        System.out.println("starting Price is  = " + startingPrice);








































    }
}
