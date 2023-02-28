package com.herbalife.labs.lab04;

import java.util.stream.IntStream;

public class AccountUser {
    public static void main(String[] args) {
        //operateOnNormalAccount();
        operateOnCurrentAccount();
    }

    private static void operateOnCurrentAccount() {
        Account account = new CurrentAccount("cacc101", 200000);
        account.deposit(1000);
        account.deposit(1000);
        //YOU WILL LEARN IT LATER
        IntStream
                .range(1, 13)
                .forEach((i) -> account.withdraw(100));

//        for (int i = 0; i < 12; i++) {
//            account.withdraw(100);
//        }
        System.out.println("Balance: " + account.getBalance());
        System.out.println("***Print statement***");
        account.printStatement();
        account.withdraw(1000000);
    }

    private static void operateOnNormalAccount() {
        Account account = new Account("acc101", 20000);
        account.deposit(1000);
        account.deposit(1000);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        account.withdraw(100);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("***Print statement***");
        account.printStatement();
        //account.withdraw(100000);
    }
}
