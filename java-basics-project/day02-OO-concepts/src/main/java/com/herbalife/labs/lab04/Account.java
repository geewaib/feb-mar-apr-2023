package com.herbalife.labs.lab04;

import java.util.ArrayList;

public class Account {
    private String accountNumber;
    private double balance;
    private int withdrawCount;
    private ArrayList<Transaction> transactions;

    public Account(String accountNumber, double balance) {
        if (balance < 10000) {
            throw new RuntimeException("Minimum balance should be 10000");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getWithdrawLimit() {
        return 3;
    }

    public void deposit(double amount) {
        balance += amount;
        this.transactions.add(new Transaction(accountNumber, amount, "CR"));
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            throw new RuntimeException("Insufficient balance");
        }
        withdrawCount++;
        balance -= amount;
        this.transactions.add(new Transaction(accountNumber, amount, "DEBIT"));
        if (withdrawCount > getWithdrawLimit()) {
            double fee = amount * 0.005;
            balance -= fee;
            this.transactions.add(new Transaction(accountNumber, amount, "FEE"));
        }
    }

    public void printStatement() {
        //YOU WILL LEARN IT LATER
        this.transactions.forEach(System.out::println);

//        for (int i = 0; i < transactions.size(); i++) {
//            System.out.println(transactions.get(i));
//        }
    }


}
