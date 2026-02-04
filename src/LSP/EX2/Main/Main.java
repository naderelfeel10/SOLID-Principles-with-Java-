package LSP.EX2.Main;

import LSP.EX2.problem.BankAccount;
import LSP.EX2.problem.BankingService;
import LSP.EX2.problem.FixedTermDepositAccount;
import LSP.EX2.problem.SavingsAccount;
import LSP.EX2.solution.WithdrawableAccount;

public class Main {

    static BankingService bankingService = new BankingService();
    public static void main(String[] args){

        // the problem :
        BankAccount savingAccount = new SavingsAccount();
        bankingService.processWithdrawal(savingAccount, 100);

        // this will throw an exception
        BankAccount fixedAccount = new FixedTermDepositAccount();
        //bankingService.processWithdrawal(fixedAccount, 100);

        // solution :

        WithdrawableAccount savingAcc = new LSP.EX2.solution.SavingsAccount();
        bankingService.processWithdrawal(savingAccount,100);
        // the fixed account is not even withdrawable
        // so the logic is perfect












    }
}
