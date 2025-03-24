package com.example.cbdatabase.service;

import com.example.cbdatabase.domain.Account;
import com.example.cbdatabase.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public Account create(Account account) {
        return accountRepository.save(account);
    }
}