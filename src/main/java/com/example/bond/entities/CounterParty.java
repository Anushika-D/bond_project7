package com.example.bond.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "counterparty")
public class CounterParty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "counterParty")
    private List<Trade> trades;
}
