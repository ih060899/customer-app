package com.example.customer_app.controller;

import com.example.customer_app.payloads.AccountRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @PostMapping
    public Mono<ResponseEntity<AccountRequest>> createAccount(@Valid @RequestBody AccountRequest accountRequest) {
        return Mono.just(ResponseEntity.ok(accountRequest));
    }
}