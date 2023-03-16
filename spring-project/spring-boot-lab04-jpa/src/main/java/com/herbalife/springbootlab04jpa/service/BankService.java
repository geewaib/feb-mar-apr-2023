package com.herbalife.springbootlab04jpa.service;

import com.herbalife.springbootlab04jpa.entity.Account;
import com.herbalife.springbootlab04jpa.entity.Statement;
import com.herbalife.springbootlab04jpa.exception.AccountNotFoundException;
import com.herbalife.springbootlab04jpa.repository.AccountRepository;
import com.herbalife.springbootlab04jpa.repository.StatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BankService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private StatementRepository statementRepository;

    public List<String> printStatement(String accountNumber) {
        Optional<Account> optionalAccount = accountRepository.loadAllStatements(accountNumber);
        if (optionalAccount.isPresent()) {
            List<Statement> statements = optionalAccount.get().getStatements();
            return statements
                    .stream()
                    .map(st -> st.toString())
                    .collect(Collectors.toList());
        } else {
            throw new AccountNotFoundException(accountNumber);
        }
    }

    public void deposit(String accountNumber, int amount, String type) {
        Optional<Account> optionalAccount = accountRepository.findById(accountNumber);
        if (optionalAccount.isPresent()) {
            Account account = optionalAccount.get();
            account.setBalance(account.getBalance() + amount);
            accountRepository.save(account);
            createStatement(amount, type, account);
        } else {
            throw new AccountNotFoundException(accountNumber);
        }
    }

    public void withdraw(String accountNumber, int amount, String type) {
        Optional<Account> optionalAccount = accountRepository.findById(accountNumber);
        if (optionalAccount.isPresent()) {
            Account account = optionalAccount.get();
            account.setBalance(account.getBalance() - amount);
            accountRepository.save(account);
            createStatement(amount, type, account);
        } else {
            throw new AccountNotFoundException(accountNumber);
        }
    }

    private void createStatement(int amount, String type, Account account) {
        Statement statement = new Statement();
        statement.setType(type);
        statement.setAmount(amount);
        statement.setAccount(account);
        statementRepository.save(statement);
    }
}
