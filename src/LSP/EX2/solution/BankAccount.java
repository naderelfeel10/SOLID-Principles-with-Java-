package LSP.EX2.solution;

public class BankAccount {
    protected double balance;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance(){
        return balance;
    }


}