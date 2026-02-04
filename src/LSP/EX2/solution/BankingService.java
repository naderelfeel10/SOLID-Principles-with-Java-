package LSP.EX2.solution;

public class BankingService {

    public void processWithdrawal(WithdrawableAccount account, double amount) {
        account.withdraw(amount);
        System.out.println("done withdrawing");
    }

}