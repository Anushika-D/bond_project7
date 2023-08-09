package com.example.bond.entities;

import com.example.bond.entities.Trade;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "security")
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "isin")
    private String isin;

    @Column(name = "cusip")
    private String cusip;

    @Column(name = "issuer")
    private String issuer;

    @Column(name = "maturity_date")
    private LocalDate maturityDate;

    @Column(name = "coupon")
    private Double coupon;

    @Column(name = "type")
    private String type;

    @Column(name = "face_value")
    private Double faceValue;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "security")
    @JsonBackReference
    private List<Trade> trades;

    public Security() {
    }

    public Security(Long id, String name,String isin, String cusip, String issuer, LocalDate maturityDate, Double coupon, String type, Double faceValue, String status, List<Trade> trades) {
        Id = id;
        this.name=name;
        this.isin = isin;
        this.cusip = cusip;
        this.issuer = issuer;
        this.maturityDate = maturityDate;
        this.coupon = coupon;
        this.type = type;
        this.faceValue = faceValue;
        this.status = status;
        this.trades = trades;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    public Double getCoupon() {
        return coupon;
    }

    public void setCoupon(Double coupon) {
        this.coupon = coupon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Double faceValue) {
        this.faceValue = faceValue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Trade> getTrades() {
        return trades;
    }

    public void setTrades(List<Trade> trades) {
        this.trades = trades;
    }
}
