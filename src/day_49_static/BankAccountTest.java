package day_49_static;

public class BankAccountTest {
    public static void main(String[] args) {

        MyBankAccount husband = new MyBankAccount();
        husband.user = "Husband";
        husband.showBalance();
        husband.spend(100.0);
        husband.showBalance();

        MyBankAccount wife = new MyBankAccount();
        wife.user = "wife";
        wife.showBalance();




    }
}
