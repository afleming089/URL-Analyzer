package com.example.cbdatabase.controller;

import com.example.cbdatabase.domain.URL;
import com.example.cbdatabase.service.urlService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class urlController {

    private final urlService urlService;

    @CrossOrigin
    @PostMapping("/url")
    public ResponseEntity<?> save(@RequestBody URL url) {

        System.out.println("Name : " + url.getName());
        System.out.println("URL : " + url.getUrl());

        String userId = "test";

        return new ResponseEntity<>(urlService.create(url, userId), HttpStatus.CREATED);
    }

    @GetMapping("/urls")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(urlService.findAll(), HttpStatus.OK);
    }
}
