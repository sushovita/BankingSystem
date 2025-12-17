package bank;

import java.io.Serializable;

public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String type;
    private final double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return type + ": " + amount;
    }
}
