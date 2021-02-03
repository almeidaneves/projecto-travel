package com.almeidaneves.travelapi.controller.account;

import com.almeidaneves.travelapi.exception.GeneralResponse;
import com.almeidaneves.travelapi.exception.TravelGeneral;
import com.almeidaneves.travelapi.exception.TravelResponse;
import com.almeidaneves.travelapi.model.accout.Account;
import com.almeidaneves.travelapi.repository.account.AccountRepository;
import com.almeidaneves.travelapi.service.account.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/api-travels/accounts/")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;
    @Autowired
    private AccountRepository accountRepository;

    /**
     * @see AccountServiceImpl#save(Account)
     */
    @PostMapping("put")
    @ResponseStatus(HttpStatus.CREATED)
    public TravelResponse save(@RequestBody Account request){
        GeneralResponse response = new GeneralResponse();
        Account account = null;
        try{
            account = accountService.save(request);
            response.setGeneral(account);
            response.setResponseCode(200);
            response.setDescription("Success");
            return response;
        }catch (Exception ex ){
            response.setResponseCode(400);
            response.setDescription("Error saving account");

        }
        return response;
    }

    @GetMapping("getByAccountNumber/{accountNumber}")
    public TravelResponse getAccountByAccountNumber(@PathVariable("accountNumber") String accountNumber){

        GeneralResponse response = new GeneralResponse();
        try {
            Optional<Account> optionalAccount = accountService.findAccountByAccountNumber(accountNumber);

            if (!optionalAccount.isPresent()) {
                response.setResponseCode(400);
                response.setDescription("Account number is invalid");
            }
            Account accountAux = optionalAccount.get();
            response.setGeneral(accountAux);
            response.setResponseCode(200);
            response.setDescription("Success");
        }catch (IllegalArgumentException ex){
            response.setResponseCode(400);
            response.setDescription("Data invalid");
        }
        catch (NoSuchElementException e){
            response.setResponseCode(500);
            response.setDescription("No value present");
        }
        return response;

    }
    @GetMapping("travels")
    public TravelResponse getTravels(){

        GeneralResponse response = new GeneralResponse();
        try {
            List<Account> accountList = accountRepository.findAll();
            response.setResponseCode(200);
            response.setDescription("Success");
            response.setGeneralList(accountList);

        }catch (NoSuchElementException ex){
            response.setResponseCode(500);
            response.setDescription("List is empty");
        }
        return response;


    }

}
