package bank;

import java.io.Serializable;
import java.util.HashMap;

public class Bank implements Serializable {
    private static final long serialVersionUID = 1L;

    private HashMap<Integer, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(int accountNumber, String name, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account already exists");
            return;
        }

        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative");
            return;
        }

        Account account = new Account(accountNumber, name, initialBalance);
        accounts.put(accountNumber, account);

        System.out.println("Account created successfully");
    }

    public Account getAccount(int accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found");
            return null;
        }
        return accounts.get(accountNumber);
    }

    public void checkBalance(int accountNumber) {
        Account acc = accounts.get(accountNumber);
        if (acc == null) {
            System.out.println("Account not found");
        } else {
            System.out.println("Current balance: " + acc.getBalance());
        }
    }
}


