package com.example.bond.service;
import com.example.bond.entities.Trade;
import com.example.bond.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TradeService {

    @Autowired
    TradeRepository tradeRepository;

    public List<Trade> getAllTrades(){
        List<Trade> trades = new ArrayList<Trade>();
        tradeRepository.findAll().forEach(trade -> trades.add(trade));
        for (Trade trade : trades) {
            trade.updateStatus();
            tradeRepository.save(trade);
        }
        return trades;
    }
    public Trade getTradeById(Integer id)
    {
        List<Trade> trades=getAllTrades();
        return tradeRepository.findById(id).get();
    }
    public void saveOrUpdate(Trade trade)
    {
        tradeRepository.save(trade);
    }
    //deleting a specific record
    public void delete(int id)
    {
        tradeRepository.deleteById(id);
    }

    public List<Trade> getTradeByBookName(String bookname) {
        List<Trade> trades=getAllTrades();
        return tradeRepository.getTradeByBook_Name(bookname);
    }
}