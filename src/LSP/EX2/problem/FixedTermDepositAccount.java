package LSP.EX2.problem;

public class FixedTermDepositAccount extends BankAccount {

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawals are not allowed for Fixed Term accounts until maturity!");
    }
}