
package com.example.bond.controller;

import com.example.bond.service.MockAccountGenerateServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mockaccount")
public class MockAccountController {
    private final MockAccountGenerateServices dummyAccountGenerateService;

    public MockAccountController(MockAccountGenerateServices dummyAccountGenerateService) {
        this.dummyAccountGenerateService = dummyAccountGenerateService;
    }

    @GetMapping("/generatedummyaccounts")
    public void generateDummyAccounts() {
        dummyAccountGenerateService.generateAccounts();
    }

}