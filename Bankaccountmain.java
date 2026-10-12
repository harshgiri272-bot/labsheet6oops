public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("A1001", "Amit", 5000);
        account.deposit(1000);
        account.withdraw(2000);
        account.withdraw(10000);
        account.displayAccount();
    }
}
class BankAccount {
    private String accountNo, accountHolderName;
    private double balance;
    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    void withdraw(double amount) {
        boolean success;
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            success = true;
        } else success = false;
        System.out.println("Withdrawal successful: " + success);
    }
    double getBalance() { return balance; }
    void displayAccount() {
        System.out.println(accountNo + " | " + accountHolderName + " | Balance: " + balance);
    }
}
