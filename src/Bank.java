import java.util.HashMap;

public class Bank {

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

}

