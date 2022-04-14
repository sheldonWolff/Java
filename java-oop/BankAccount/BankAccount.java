public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static int totalMonies = 0;
    public BankAccount(double cBalance, double sBalance) {
        checkingBalance = cBalance;
        savingsBalance = sBalance;
        numberOfAccounts++;
        totalMonies += cBalance + sBalance;
    }
    public static double totalAmount() {
        return totalMonies;
    }
    public double getCheckingBalance() {
        System.out.printf("Your checking account balance is $ %.2f \n", checkingBalance);
        return checkingBalance;
    }
    public double getSavingsBalance() {
        System.out.printf("Your savings account balance is $ %.2f \n", savingsBalance);
        return savingsBalance;
    }
    public double checkingDeposit(double amount) {
        checkingBalance += amount;
        System.out.printf("$ %.2f deposited to your checking account.\n", amount);
        totalMonies += amount;
        System.out.printf("Your new checking account balance is $ %.2f \n", checkingBalance);
        return checkingBalance;
    }
    public double savingsDeposit(double amount) {
        savingsBalance += amount;
        System.out.printf("$ %.2f deposited to your savings account. \n", amount);
        totalMonies += amount;
        System.out.printf("Your new savings account balance is $ %.2f \n", savingsBalance);
        return savingsBalance;
    }
    public double checkingWithdraw(double amount) {
        if (amount <= getCheckingBalance()) {
            checkingBalance -= amount;
            totalMonies -= amount;
            System.out.printf("$ %.2f withdrawn from your checking account.\n", amount);
            System.out.printf("Your new checking account balance is $ %.2f \n", checkingBalance);
        }
        else {
            System.out.println("Insufficient Funds");
        }
        return checkingBalance;
    }
    public double savingsWithdraw(double amount) {
        if (amount <= getSavingsBalance()) {
            savingsBalance -= amount;
            totalMonies -= amount;
            System.out.printf("$ %.2f withdrawn from your savings account. \n", amount);
            System.out.printf("Your new savings account balance is $ %.2f \n", savingsBalance);
        }
        else {
            System.out.println("Insufficient Funds");
        }
        return savingsBalance;
    }
    public double totalMoney() {
        System.out.printf("Your combined account total is $ %.2f", totalAmount());
        return totalAmount();
    }
}