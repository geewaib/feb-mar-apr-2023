package com.herbalife.labs.lab05;

public class EnumVsInterfaceConstants {
    public static void main(String[] args) {
        print(AccountConstants.CREDIT);
        print(AccountConstants.DEBIT);
        print(AccountConstants.FEE);
        print("kfjhdskjfgdskjfgksdjfgkjsgf");

        printInfo(AccountOperationType.CREDIT);
        printInfo(AccountOperationType.DEBIT);
        printInfo(AccountOperationType.FEE);
        //printInfo("dsfdsfdsfdsfsdf");

    }
    static void print(String operation) {
        System.out.println(operation);
    }

    static void printInfo(AccountOperationType accountOperationType) {
        System.out.println(accountOperationType);
    }
}
