package LSP.EX2.problem;

import LSP.EX2.problem.BankAccount;

public class BankingService {

    public void processWithdrawal(BankAccount account, double amount) {
        account.withdraw(amount);
        System.out.println("done withdrawing");
    }

}