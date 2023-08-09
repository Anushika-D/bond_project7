package com.example.bond.service;

import java.util.ArrayList;
import java.util.List;

import com.example.bond.entities.Book;
import com.example.bond.entities.Security;
import com.example.bond.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SecurityService {

    @Autowired
    SecurityRepository securityRepository;

    public List<Security> getAllSecurities(){
        List<Security> securities = new ArrayList<Security>();
        securityRepository.findAll().forEach(security -> securities.add(security));
        return securities;
    }
    public Security getSecurityById(Long id)
    {
        return securityRepository.findById(id).get();
    }
}