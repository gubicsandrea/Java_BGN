package bank;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public void transfer(BankAccount to, int amount) {
        if (to != null && amount > 0 && amount <= balance) {
            withdraw(amount);
            to.deposit(amount);
        }
    }

    public String getInfo() {
        return accountNumber + "\n" + owner + "\n" + balance + " Ft";
    }
}
