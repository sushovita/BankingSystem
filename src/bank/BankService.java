package bank;

public class BankService {

    private Bank bank;

    public BankService(Bank bank) {
        this.bank = bank;
    }

    public void createAccount(int accNo, String name, double balance) {
        bank.createAccount(accNo, name, balance);
    }

    public void deposit(int accNo, double amount) {
        Account acc = bank.getAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found");
            return;
        }
        acc.deposit(amount);
    }

    public void withdraw(int accNo, double amount) {
        Account acc = bank.getAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found");
            return;
        }
        acc.withdraw(amount);
    }

    public void checkBalance(int accNo) {
        Account acc = bank.getAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found");
            return;
        }
        System.out.println("Current balance: " + acc.getBalance());
    }


    public void showTransactions(int accNo) {
        Account acc = bank.getAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found");
            return;
        }
        acc.printTransactionHistory();
    }

    public Bank getBank() {
        return bank;
    }
}
