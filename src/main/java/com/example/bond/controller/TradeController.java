package com.example.bond.controller;

import java.util.List;
import com.example.bond.service.TradeService;
import com.example.bond.entities.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trade")
public class TradeController {

    @Autowired
    TradeService tradeService;

    @GetMapping("/getAllTrades")
    private List<Trade> getAllTrades()
    {
        return tradeService.getAllTrades();
    }

    @GetMapping("/{id}")
    private Trade getTrade(@PathVariable("id")Integer id)
    {
        return tradeService.getTradeById(id);
    }

    @GetMapping("/book/{bookname}")
    private List<Trade> getTradeByBookName(@PathVariable("bookname")String bookname)
    {
        return tradeService.getTradeByBookName(bookname);
    }

    @DeleteMapping("/{id}")
    private void deleteUser(@PathVariable("id")int id) {
        tradeService.delete(id);
    }

    @PostMapping("/save")
    private Integer saveUser(@RequestBody Trade trade)
    {
        tradeService.saveOrUpdate(trade);
        return trade.getId ();
    }
}