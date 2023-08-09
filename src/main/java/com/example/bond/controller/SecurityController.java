package com.example.bond.controller;

import java.util.List;

import com.example.bond.entities.Book;
import com.example.bond.service.SecurityService;
import com.example.bond.entities.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    SecurityService securityService;

    @GetMapping("/getAllSecurities")
    private List<Security> getAllSecurity()
    {
        return securityService.getAllSecurities();
    }

    @GetMapping("/{id}")
    private Security getSecurity(@PathVariable("id")Long id)
    {
        return securityService.getSecurityById(id);
    }
    @PostMapping("/save")
    private Long saveSecurity(@RequestBody Security security)
    {
        securityService.saveOrUpdate(security);
        return security.getId();
    }
}