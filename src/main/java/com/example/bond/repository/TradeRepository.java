package com.example.bond.repository;

import com.example.bond.entities.Trade;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TradeRepository extends CrudRepository<Trade, Integer>{

    List<Trade> getTradeByBook_Name(String name);
}