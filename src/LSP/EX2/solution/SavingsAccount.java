package LSP.EX2.solution;

public class SavingsAccount extends BankAccount implements WithdrawableAccount {

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
}