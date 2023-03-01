package com.herbalife.labs.lab05;

import static com.herbalife.labs.lab05.AccountConstants.*;

public class CurrentAccount implements Account {
    private CommonAccount commonAccount;

    public CurrentAccount(String accountNumber, double balance) {
        this.commonAccount = createInstance(accountNumber, balance, 10000);
    }

    public String getAccountNumber() {
        return this.commonAccount.getAccountNumber();
    }

    public double getBalance() {
        return this.commonAccount.getBalance();
    }


    public void deposit(double amount) {
        this.commonAccount.setBalance(this.commonAccount.getBalance() + amount);
        this.commonAccount.getTransactions().add(new Transaction(this.commonAccount.getAccountNumber(), amount, AccountOperationType.CREDIT));
    }

    public void withdraw(double amount) {
        if (this.getBalance() < amount) {
            throw new RuntimeException(INSUFFICIENT_BALANCE_MESSAGE);
        }
        this.commonAccount.incrementWithdrawCount();
        this.commonAccount.setBalance(this.commonAccount.getBalance() - amount);
        this.commonAccount.getTransactions().add(new Transaction(this.commonAccount.getAccountNumber(), amount, AccountOperationType.DEBIT));
        if (this.commonAccount.getWithdrawCount() > CURRENT_ACCOUNT_WITHDRAW_LIMIT) {
            double fee = amount * WITHDRAW_FEE;
            this.commonAccount.setBalance(this.commonAccount.getBalance() - fee);
            this.commonAccount.getTransactions().add(new Transaction(this.commonAccount.getAccountNumber(), amount, AccountOperationType.FEE));
        }
    }

    public void printStatement() {
        this.commonAccount.getTransactions().forEach(System.out::println);
    }

}
