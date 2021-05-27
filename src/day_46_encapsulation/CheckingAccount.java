package day_46_encapsulation;

public class CheckingAccount {

    private long accountNumber;
    private String accountHolder;
    private String type = "Checking"; // default is checking and we can changed if needed using setter
    private double balance;

    //right click > generate > getter and setter > select all > ok  // how to do that - shift + click < last one and ok


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}



