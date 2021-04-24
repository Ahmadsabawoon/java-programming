package day_35_methods_with_param;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
/*
     Scanner input = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = input.nextLine();
        nameArray(name);

    }
    public static void nameArray(String myName) {
        char[] myNameChar = myName.toCharArray();
        for (char eachMyNameChar : myNameChar) {
            System.out.print(eachMyNameChar + " ");
        }
 */
public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(25);
        displayValue(65);
        carModel("camry");
        int count = 55;
        displayValue(count);
        String Love = "I love you";  // we should change our variable method
        String name = "Ahmad";
        greetByName(name);

    }

    public static void displayValue(int num) {
        System.out.println("Value is " + num);

}
public static void carModel(String camry) {
    System.out.println("Car Model is: " + camry);
}
public static void greetByName(String name){
    System.out.println("Hello " +name + " how are you today");
}

}

