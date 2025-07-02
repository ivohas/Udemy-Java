package pirategame;

public final class BankAccount {
    private final String accountNumber;
    private final double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount deposit(double amount) {
        return new BankAccount(accountNumber, balance + amount);
    }

    public BankAccount withdraw(double amount) {
        return new BankAccount(accountNumber, balance - amount);
    }

    @Override
    public String toString() {
        return accountNumber + ": $" + balance;
    }
}
