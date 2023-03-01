package com.herbalife.labs.lab05;

import java.util.ArrayList;
import static com.herbalife.labs.lab05.AccountConstants.*;

public class CommonAccount {
    private String accountNumber;
    private double balance;
    private int withdrawCount;
    private ArrayList<Transaction> transactions;

    public CommonAccount(String accountNumber, double balance, double initialAmount) {
        if (balance < initialAmount) {
            throw new RuntimeException(String.format(MINIMUM_BALANCE_MESSAGE, initialAmount));
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getWithdrawCount() {
        return withdrawCount;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void incrementWithdrawCount() {
        withdrawCount++;
    }
}

