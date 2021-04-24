package day_34_void_methods;

public class FirstMethods {
    public static void main(String[] args) {
        displayMessage();   //1 call the methode
        displayMessage(); // 2 call the methode
        displayMessage();
        for (int i = 0; i <= 100; i++){
            System.out.print(i + " - ");
            displayMessage();
        }


    }


// first custom reusable method
    public static void displayMessage() {
        System.out.println("Hello B22 Friends!");
    }











}
