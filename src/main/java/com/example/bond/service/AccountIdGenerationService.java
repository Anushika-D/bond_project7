package com.example.bond.service;

import org.springframework.stereotype.Service;

@Service
public class AccountIdGenerationService {
    public Long newAccountId() {
        return System.nanoTime();
    }
}