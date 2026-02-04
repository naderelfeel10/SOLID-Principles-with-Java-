package LSP.EX2.problem;

public class BankAccount {
    protected double balance;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}