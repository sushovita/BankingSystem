package bank;

import java.util.ArrayList;

public class Account {

    private int accountNumber;
    private String name;
    private double balance;

    private ArrayList<Transaction> transactions;

    // Constructor
    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.transactions = new ArrayList<>(); // IMPORTANT
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
            return;
        }
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
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
        transactions.add(new Transaction("Withdraw", amount));
        System.out.println("Withdrawn: " + amount);
    }

    public void printTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }

        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public double getBalance() {
        return balance;
    }
}
