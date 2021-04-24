package day17_ternary_nested_condition;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink"; // tea or coke
        String drinkItem = "tea"; // candy
        String snackItem = "chips";
        if(selection.equals("drink")){
            System.out.println("drink option is selected");
            if(drinkItem.equals("tea")){
                System.out.println("tea item is selected");
            }else {
                System.out.println("coke item is selected");
            }
        } else if (selection.equals("snack")) {
            System.out.println("snack option is selected");
            if(snackItem.equals("chips")){
                System.out.println("chip option is selected");
        }else {
                System.out.println("candy option is selected");
            }
        }






















    }
}
