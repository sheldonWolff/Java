public class TestAccounts {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(25.50, 175.75);
        account1.getCheckingBalance();
        account1.getSavingsBalance();
        account1.checkingDeposit(198.77);
        account1.savingsDeposit(1000892.23);
        account1.checkingWithdraw(87.91);
        account1.savingsWithdraw(40500.47);
        account1.totalMoney();
        account1.checkingWithdraw(140.00);
    }
}