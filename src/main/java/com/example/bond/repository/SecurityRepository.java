package com.example.bond.repository;

import com.example.bond.entities.Security;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SecurityRepository extends CrudRepository<Security, Long>{
}