import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Exit");
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

                bank.createAccount(accNo, name, balance);
            }
            else if (choice == 2) {
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
