package day08_casting_scanner;
// balance -> 345.55
// price1 -> 20.88             price2 -> 89.99           price3 ->15
// Remaining Balance -> calculate
// your initial balance : 345.55
// your remaining balance: $199.13

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {

        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;

        double remainingBalance = balance - price1 - price2 - price3;
        // double remainingBalance = balance - (price1 - price2 - price3);
        System.out.println("Your initial balance: $" + balance);
        // balanceWithNoCents -> remainingBalance without cents
        // print: your remaining balance without cents: 219;
        System.out.println("Your remaining balance: $" + remainingBalance);

        int balanceWithNoCent = (int)remainingBalance;
        System.out.println("Your remaining balance without cents: $" + balanceWithNoCent);
        //



    }
}
