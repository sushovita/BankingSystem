package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Banking System");

        Bank bank = BankStorage.load();
        BankService service = new BankService(bank);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");


            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter account number: ");
                int accNo = scanner.nextInt();

                scanner.nextLine(); // consume newline
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter initial balance: ");
                double balance = scanner.nextDouble();

                service.createAccount(accNo, name, balance);

            }

            else if (choice == 2) {
                System.out.print("Enter account number: ");
                int accNo = scanner.nextInt();

                Account account = bank.getAccount(accNo);
                if (account != null) {
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();
                    service.deposit(accNo, amount);

                }
            }

            else if (choice == 3) {
                System.out.print("Enter account number: ");
                int accNo = scanner.nextInt();

                Account account = bank.getAccount(accNo);
                if (account != null) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    service.withdraw(accNo, amount);

                }
            }

            else if (choice == 4) {
                System.out.print("Enter account number: ");
                int accNo = scanner.nextInt();
                  service.checkBalance(accNo);

            }
            else if (choice == 5) {
                System.out.print("Enter account number: ");
                int accNo = scanner.nextInt();

                Account account = bank.getAccount(accNo);
                if (account != null) {
                    service.showTransactions(accNo);

                }
            }
            else if (choice == 6) {
                BankStorage.save(service.getBank());
                System.out.println("Thank you for using the system!");
                break;
            }




            else {
                System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}

