package gUI;

/**
 * Created by Admin on 25.12.2016.
 */
public class BankAkk {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void transaction(int withdraw) {
        balance -= withdraw;
    }

    void setBalance(int withdraw) {
        balance = withdraw;
    }
}
