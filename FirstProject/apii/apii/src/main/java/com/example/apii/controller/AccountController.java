package com.example.apii.controller;

import com.example.apii.model.AccountModel;
import com.example.apii.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private final AccountRepository repo = null;

    @GetMapping("/test")
    public List<AccountModel> test() {
        return repo.findAll();
    }

   // private final UsersRepo repo = null;
    @GetMapping("/SelectAll")
    public List<AccountModel> SelectAll() {
        return repo.findAll();
    }

    @GetMapping("/Select")
    public String Select() {
        return "Select s s";
    }

    @PostMapping("/Save")
    public String Save() {
        return "Save";
    }

    @PostMapping("/Delete")
    public String Delete() {
        return "Delete";
    }
}


