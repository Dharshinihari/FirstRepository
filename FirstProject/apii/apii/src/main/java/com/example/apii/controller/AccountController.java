package com.example.apii.controller;

import com.example.apii.model.AccountModel;
import com.example.apii.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private final AccountRepository repo = null;

    @GetMapping("/SelectAll")
    public List<AccountModel> SelectAll() {
        return repo.findAll();
    }

    @GetMapping(path = "/Select/{accountid}")
    public AccountModel Select(@PathVariable int accountid){
        return repo.findByaccountid(accountid);
    }

    @PostMapping("/Save")
    public String Save(@RequestBody AccountModel account){
        repo.save(account);
        return "Saved successfully";
    }

    @PostMapping(path ="/Update")
    public String Update(@RequestBody AccountModel account) {
        try {
            AccountModel old=repo.findByaccountid(account.getaccountid());
            repo.delete(old);
            repo.save(account);
        }
        catch (Exception e ){
            return "error: there is issue while updating "+ e.getMessage();
        }
        return "Updated successfully";
    }

    @PostMapping(path ="/Delete/{accountid}")
    public String Delete(@PathVariable int accountid) {
        AccountModel account=repo.findByaccountid(accountid);
        try {
            repo.delete(account);
        }
        catch (Exception e ){

            return "error: there is issue while deleting ";

        }

        return "Delete successfully";
    }




}

