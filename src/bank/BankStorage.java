package bank;
import java.io.*;
public class BankStorage {
        private static final String FILE_NAME = "bank-data.ser";

        public static void save(Bank bank) {
            try (ObjectOutputStream oos =
                         new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                oos.writeObject(bank);
                System.out.println("Bank data saved.");
            } catch (IOException e) {
                System.out.println("Failed to save bank data.");
            }
        }

        public static Bank load() {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                return new Bank();
            }

            try (ObjectInputStream ois =
                         new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                System.out.println("Bank data loaded.");
                return (Bank) ois.readObject();
            } catch (Exception e) {
                System.out.println("Failed to load bank data. Starting fresh.");
                return new Bank();
            }
        }
    }


