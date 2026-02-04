package LSP.EX2.problem;

public class SavingsAccount extends BankAccount {

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
}