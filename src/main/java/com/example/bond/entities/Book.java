package com.example.bond.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bookname")
    private String bookName;

    @ManyToMany(mappedBy = "books")
    private Set<User> users = new HashSet<>();

    // Constructors, getters, and setters
}
