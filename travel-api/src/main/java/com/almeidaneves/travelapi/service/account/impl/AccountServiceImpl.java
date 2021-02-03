package com.almeidaneves.travelapi.service.account.impl;

import com.almeidaneves.travelapi.model.accout.Account;
import com.almeidaneves.travelapi.repository.account.AccountRepository;
import com.almeidaneves.travelapi.service.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    /**
     * @see AccountService#save(Account)
     */
    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }
    /**
     * @see AccountService#findAccountByAccountNumber(String)
     *
     */
    @Override
    public Optional<Account> findAccountByAccountNumber(String accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber);
    }
    /**
     * @see AccountService#findById(Long)
     *
     */
    @Override
    public Optional<Account> findById(Long accountId) {
        return accountRepository.findById(accountId);
    }
}
