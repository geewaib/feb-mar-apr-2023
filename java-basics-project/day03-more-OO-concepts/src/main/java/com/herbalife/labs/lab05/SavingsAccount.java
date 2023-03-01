package com.herbalife.labs.lab05;

import java.util.ArrayList;
import static com.herbalife.labs.lab05.AccountConstants.*;

public class SavingsAccount implements Account {
    private String accountNumber;
    private double balance;
    private int withdrawCount;
    private ArrayList<Transaction> transactions;

    public SavingsAccount(String accountNumber, double balance) {
        if (balance < 10000) {
            throw new RuntimeException(String.format(MINIMUM_BALANCE_MESSAGE, 10000));
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

    public void deposit(double amount) {
        balance += amount;
        this.transactions.add(new Transaction(accountNumber, amount, AccountOperationType.CREDIT));
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            throw new RuntimeException(INSUFFICIENT_BALANCE_MESSAGE);
        }
        withdrawCount++;
        balance -= amount;
        this.transactions.add(new Transaction(accountNumber, amount, AccountOperationType.DEBIT));
        if (withdrawCount > SAVINGS_ACCOUNT_WITHDRAW_LIMIT) {
            double fee = amount * WITHDRAW_FEE;
            balance -= fee;
            this.transactions.add(new Transaction(accountNumber, amount, AccountOperationType.FEE));
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
