package bancaccount;

public class BankAccount {

    private static final double DEFAULT_INTEREST_RATE = 0.02;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 0;

    private int id;
    private double balance;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    public BankAccount() {
        this.id = ++bankAccountCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
}
