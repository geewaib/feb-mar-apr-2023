package com.herbalife.labs.lab05;

import java.util.stream.IntStream;

public class AccountUser {
    public static void main(String[] args) {
        //operateOnNormalAccount();
        operateOnCurrentAccount();
    }

    private static void operateOnCurrentAccount() {
        CurrentAccount currentAccount = new CurrentAccount("cacc101", 20000);
        currentAccount.deposit(1000);
        currentAccount.deposit(1000);
        //YOU WILL LEARN IT LATER
        IntStream
                .range(1, 13)
                .forEach((i) -> currentAccount.withdraw(100));

//        for (int i = 0; i < 12; i++) {
//            account.withdraw(100);
//        }

        String message = String.format("Account number: %s, Balance : %s", currentAccount.getAccountNumber(), currentAccount.getBalance());
        System.out.println(message);
        System.out.println("***Print statement***");
        currentAccount.printStatement();
        currentAccount.withdraw(1000000);
    }

    private static void operateOnNormalAccount() {
        SavingsAccount savingsAccount = new SavingsAccount("acc101", 20000);
        savingsAccount.deposit(1000);
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        savingsAccount.withdraw(100);
        String message = String.format("Account number: %s, Balance : %s", savingsAccount.getAccountNumber(), savingsAccount.getBalance());
        System.out.println(message);
        System.out.println("***Print statement***");
        savingsAccount.printStatement();
        //account.withdraw(100000);
    }
}
