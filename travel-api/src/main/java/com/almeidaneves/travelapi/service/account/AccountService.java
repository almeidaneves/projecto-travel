package com.almeidaneves.travelapi.service.account;

import com.almeidaneves.travelapi.model.accout.Account;

import java.util.Optional;

public interface AccountService {
    /**
     * Method that save an account in the database
     *
     * @author TestAlmeidaNeves
     * @since 03/02/2021
     * @param account
     * @return <code> Account</code>
     */
    public Account save(Account account);

    /**
     * Method that find an account by accountNumber in database
     *
     * @author TestAlmeidaNeves
     * @since 03/02/2021
     * @param account
     * @return Optional<Account> object
     */
    public Optional<Account> findAccountByAccountNumber(String account);

    /**
     * Method that find an account by
     * @param accountId
     * @return
     */
    public Optional<Account> findById(Long accountId);

}
