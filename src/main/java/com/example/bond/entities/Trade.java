package com.example.bond.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "trade")
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="quantity")
    private Integer quantity;

    @Column(name="status")
    private String status;

    @Column(name="price")
    private double price;

    @Column(name="buy_sell")
    private String buySell;

    @Column(name="trade_date")
    private LocalDate tradeDate;

    @Column(name="settlement_date")
    private LocalDate settlementDate;

    @ManyToOne
    @JoinColumn(name = "counterparty_id")
    private CounterParty counterParty;

    @ManyToOne
    @JoinColumn(name = "security_id")
    @JsonManagedReference
    private Security security;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public Trade() {
        // Default constructor
    }

    public Trade(Integer id, String name,int quantity, String status,
                 double price, String buySell, LocalDate tradeDate, LocalDate settlementDate) {
        this.id = id;
        this.name=name;
        this.quantity = quantity;
        this.status = status;
        this.price = price;
        this.buySell = buySell;
        this.tradeDate = tradeDate;
        this.settlementDate = settlementDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public LocalDate getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(LocalDate tradeDate) {
        this.tradeDate = tradeDate;
    }

    public LocalDate getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(LocalDate settlementDate) {
        this.settlementDate = settlementDate;
    }

}
