package com.herbalife.labs.lab04;

public class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public int getWithdrawLimit() {
        return 10;
    }

    public void withdraw(double amount) {
        if (amount > 100000) {
            throw new RuntimeException("Maximum amount is 100000 only");
        }
        super.withdraw(amount);
    }

}
