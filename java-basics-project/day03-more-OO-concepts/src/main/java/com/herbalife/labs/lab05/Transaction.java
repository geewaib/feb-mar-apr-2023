package com.herbalife.labs.lab05;

import java.time.LocalTime;

public class Transaction {
    private String accountNumber;
    private double amount;
    private AccountOperationType type;
    private LocalTime time;

    public Transaction(String accountNumber, double amount, AccountOperationType type) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
        this.time = LocalTime.now();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "accountNumber='" + accountNumber + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", time=" + time +
                '}';
    }
}
