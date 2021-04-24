package day17_ternary_nested_condition;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double price = 30;
        boolean isPrimeMember = true;
        if(isPrimeMember) {
            System.out.println("Eligible for free 2 days shipping");
        }else{
            if(price > 25){
                System.out.println("Eligible for free regular shipping");
            }else{
                System.out.println("Not eligible for free shipping, fee is $10");
            }

        }
    }
}
