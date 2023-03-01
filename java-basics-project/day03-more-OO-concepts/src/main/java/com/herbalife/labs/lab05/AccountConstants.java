package com.herbalife.labs.lab05;

public interface AccountConstants {
    int SAVINGS_ACCOUNT_WITHDRAW_LIMIT = 3;
    int CURRENT_ACCOUNT_WITHDRAW_LIMIT = 10;
    double WITHDRAW_FEE = 0.005;
    String INSUFFICIENT_BALANCE_MESSAGE = "Insufficient balance";
    String MINIMUM_BALANCE_MESSAGE = "Minimum balance should be %s";


    //Better marked as enum
    String CREDIT = "CR";
    String DEBIT = "DEBIT";
    String FEE = "FEE";
}
