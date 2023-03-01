package com.herbalife.labs.lab05;

public interface Account {

    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
    void printStatement();

    default CommonAccount createInstance(String accountNumber, double balance, double initialAmount) {
        return new CommonAccount(accountNumber, balance, initialAmount);
    }
}
