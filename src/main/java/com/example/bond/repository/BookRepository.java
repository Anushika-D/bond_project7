package com.example.bond.repository;

import com.example.bond.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer>{

    List<Book> getBookByUsers_Name(String name);
}