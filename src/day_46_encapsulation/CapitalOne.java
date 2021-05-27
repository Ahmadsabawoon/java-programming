package day_46_encapsulation;

public class  CapitalOne {
    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount();

        account.setAccountHolder("Ahmad");
        System.out.println("account Holder is = " + account.getAccountHolder());

        account.setBalance(10.0000);
        System.out.println("account balance = " + account.getBalance());

       account.setType("checking");
        System.out.println("account type = " + account.getType());

        account.setAccountNumber(416627373883L);
        System.out.println("account Number  = " + account.getAccountNumber());

    }
}
