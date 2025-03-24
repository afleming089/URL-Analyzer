package com.example.cbdatabase.service;

import com.example.cbdatabase.domain.URL;
import com.example.cbdatabase.domain.Account;
import com.example.cbdatabase.repository.AccountRepository;
import com.example.cbdatabase.repository.urlRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@AllArgsConstructor
@Service
public class urlService {

    private final urlRepository urlRepository;
    private final AccountRepository accountRepository;

    public URL create(URL url, String userId){

        Account account = accountRepository.findByUserId(userId).orElse(null);

        if (account != null){
            url.setAccount(account);
        }

        return urlRepository.save(url);
    }

    @GetMapping("/url")
    public List<URL> findAll(){
        return urlRepository.findAll();
    }
}
