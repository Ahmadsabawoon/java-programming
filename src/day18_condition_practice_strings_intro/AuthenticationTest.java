package day18_condition_practice_strings_intro;

public class AuthenticationTest {
    public static void main(String[] args) {
        int last4SSN = 1234;
        int pinCode = 4321;
        int expLast4SSN = 1234;
        int expPinCode = 4321;


        if(last4SSN == expLast4SSN && expPinCode == pinCode ) {
            System.out.println("Authentication is successful");
        }else {
            System.out.println("Authentication unsuccessful");
            if (expPinCode != pinCode) {
                System.out.println("Last 4 of SSn did not match");

            }
        if (expPinCode != pinCode) {
            System.out.println("Pin is incorrect ");
        }

        }

    }

}
