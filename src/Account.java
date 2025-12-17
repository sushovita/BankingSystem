public class Account {
    private int accountNumber;
    private String name;
    private double balance;

    // Constructor
    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
    public double getBalance() {
        return balance;
    }

}
