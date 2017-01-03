/**
 * Created by josecopovi-king on 03/01/2017.
 */
import java.io.*;


public class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
