package com.example.cbdatabase.controller;

import com.example.cbdatabase.domain.Account;
import com.example.cbdatabase.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class AccountController {

    private final AccountService accountService;

    @CrossOrigin
    @PostMapping("/user")
    public ResponseEntity<?> save(@RequestBody Account account) {

        System.out.println("Name : " + account.getAccountName());
        System.out.println("Password : " + account.getAccountPassword());

        return new ResponseEntity<>(accountService.create(account), HttpStatus.CREATED);
    }
}
